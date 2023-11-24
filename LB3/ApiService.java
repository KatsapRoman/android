// ApiService.java
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("weather")
    Call<WeatherData> getWeatherData();
    // Додайте інші методи для інших запитів
}
