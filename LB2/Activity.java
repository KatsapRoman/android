// MainActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Встановіть NavController для навігації
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        // Встановіть ActionBar для використання навігації внизу екрану
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}
