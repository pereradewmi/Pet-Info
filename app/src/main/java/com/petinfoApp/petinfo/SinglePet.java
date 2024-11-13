package com.petinfoApp.petinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.Arrays;
import java.util.List;

public class SinglePet extends AppCompatActivity {

    private ViewPager2 imageCarousel;
    private ImageCarouselAdapter adapter;

    private Button lifetimeButton, mealPlanButton, vitaminsButton;
    private LinearLayout mealPlanSection, lifetimeSection, vitaminsSection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_pet);

        imageCarousel = findViewById(R.id.carouselImage);

        // List of drawable resources for the carousel
        List<Integer> images = Arrays.asList(
                R.drawable.germanshepherd,  // Add your actual image resources here
                R.drawable.germanshepherd2,
                R.drawable.germanshepherd
        );

        // Set up the adapter and attach it to the ViewPager2
        adapter = new ImageCarouselAdapter(this, images);
        imageCarousel.setAdapter(adapter);

        // Optional: Add a page change callback for additional behavior
        imageCarousel.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                // Handle page change if necessary
            }
        });

        // Initialize buttons
        lifetimeButton = findViewById(R.id.lifetimeButton);
        mealPlanButton = findViewById(R.id.mealPlanButton);
        vitaminsButton = findViewById(R.id.vitaminsButton);

        // Initialize sections
        mealPlanSection = findViewById(R.id.mealPlanSection);
        lifetimeSection = findViewById(R.id.lifetimeSection);
        vitaminsSection = findViewById(R.id.vitaminsSection);

        // Set button listeners
        lifetimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLifetimeSection();
            }
        });

        mealPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMealPlanSection();
            }
        });

        vitaminsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showVitaminsSection();
            }
        });
    }

    private void showLifetimeSection() {
        mealPlanSection.setVisibility(View.GONE);
        vitaminsSection.setVisibility(View.GONE);
        lifetimeSection.setVisibility(View.VISIBLE);
    }

    private void showMealPlanSection() {
        lifetimeSection.setVisibility(View.GONE);
        vitaminsSection.setVisibility(View.GONE);
        mealPlanSection.setVisibility(View.VISIBLE);
    }

    private void showVitaminsSection() {
        mealPlanSection.setVisibility(View.GONE);
        lifetimeSection.setVisibility(View.GONE);
        vitaminsSection.setVisibility(View.VISIBLE);
    }
}
