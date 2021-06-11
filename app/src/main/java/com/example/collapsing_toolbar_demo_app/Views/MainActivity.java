package com.example.collapsing_toolbar_demo_app.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.collapsing_toolbar_demo_app.Adapters.LocationsListAdapter;
import com.example.collapsing_toolbar_demo_app.Adapters.SliderAdapter;
import com.example.collapsing_toolbar_demo_app.R;
import com.example.collapsing_toolbar_demo_app.databinding.ActivityMainBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting up binding view
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();


        setupRecyclerView();
        setupImageSliderView();

    }

    private void setupImageSliderView() {
        int[] locationsImages = {
                R.drawable.lisbon,
                R.drawable.porto,
                R.drawable.coimbra
        };

        //Set the Adapter
        binding.imageSliderMain.setSliderAdapter(new SliderAdapter(locationsImages));

        //Set Animation
        binding.imageSliderMain.setIndicatorAnimation(IndicatorAnimationType.WORM);
        binding.imageSliderMain.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
    }

    private void setupRecyclerView() {
        String[] locationsList = {
                "Lisbon", "Porto", "Coimbra", "Braga", "Évora", "Aveiro",
                "Guimarães", "Vila Nova de Gaia", "Faro", "Matosinhos", "Portimão",
                "Leiria", "Lagos", "Albufeira", "Funchal", "Maia", "Beja",
                "Bragança", "Almada", "Sintra", "Tomar", "Covilhã", "Óbidos", "Amadora",
                "Chaves", "Alcobaça", "Vila Real", "Odivelas"
        };

        //Set the adapter
        binding.locationsRecyclerView.setAdapter(new LocationsListAdapter(locationsList));


    }
}