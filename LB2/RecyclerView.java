// DetailFragment.java
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {

    private ImageView detailImage;
    private TextView detailTitle;
    private TextView detailDescription;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        detailImage = view.findViewById(R.id.detailImage);
        detailTitle = view.findViewById(R.id.detailTitle);
        detailDescription = view.findViewById(R.id.detailDescription);

        // Отримайте дані з Bundle
        Bundle bundle = getArguments();
        if (bundle != null) {
            String title = bundle.getString("title", "");
            String description = bundle.getString("description", "");
            int imageRes = bundle.getInt("imageRes", R.drawable.placeholder_image);

            // Встановіть дані до елементів UI
            detailTitle.setText(title);
            detailDescription.setText(description);
            detailImage.setImageResource(imageRes);
        }

        return view;
    }
}
