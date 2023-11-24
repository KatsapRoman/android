// WeatherRepository.java
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherRepository {
    private ApiService apiService;

    public WeatherRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public LiveData<WeatherData> getWeatherData() {
        MutableLiveData<WeatherData> data = new MutableLiveData<>();
        apiService.getWeatherData().enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                if (response.isSuccessful()) {
                    data.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {
                // Обробка помилок
            }
        });
        return data;
    }
}
