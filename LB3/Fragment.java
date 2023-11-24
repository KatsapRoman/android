// WeatherFragment.java
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class WeatherFragment extends Fragment {

    private WeatherViewModel viewModel;
    private TextView cityTextView;
    private TextView temperatureTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);

        cityTextView = view.findViewById(R.id.cityTextView);
        temperatureTextView = view.findViewById(R.id.temperatureTextView);

        // Ініціалізуйте ViewModel
        viewModel = new ViewModelProvider(this).get(WeatherViewModel.class);
        viewModel.getWeatherData().observe(getViewLifecycleOwner(), weatherData -> {
            // Оновіть UI, коли дані змінюються
            cityTextView.setText(weatherData.getCity());
            temperatureTextView.setText(weatherData.getTemperature());
        });

        return view;
    }
}
