// MyApplication.java
import android.app.Application;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyApplication extends Application {

    private static final String BASE_URL = "https://api.example.com/";
    private static ApiService apiService;

    @Override
    public void onCreate() {
        super.onCreate();

        // Ініціалізуйте Retrofit та ApiService
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(ApiService.class);
    }

    public static ApiService getApiService() {
        return apiService;
    }
}
