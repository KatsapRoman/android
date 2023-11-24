// WeatherViewModel.java
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class WeatherViewModel extends ViewModel {
    private WeatherRepository repository;
    private LiveData<WeatherData> weatherData;

    public WeatherViewModel(WeatherRepository repository) {
        this.repository = repository;
        this.weatherData = repository.getWeatherData();
    }

    public LiveData<WeatherData> getWeatherData() {
        return weatherData;
    }
}
