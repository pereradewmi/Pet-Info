package com.petinfoApp.petinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CategeryNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_categery_new);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btn = findViewById(R.id.moreInfoButton1);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CategeryNew.this, SinglePet.class);
                startActivity(intent);
            }
        });

        // Access the home_icon from the included layout (bottom_bar)
        RelativeLayout bottomNavBar = findViewById(R.id.bottom_nav_bar); // The ID of the <include> tag
        ImageView homeIcon = bottomNavBar.findViewById(R.id.home_icon);

        // Set a click listener for the home icon
        homeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the Home activity
                Intent intent = new Intent(CategeryNew.this, Home.class); // Replace 'CurrentActivity' with the name of your activity
                startActivity(intent);
            }
        });


        Button dogsButton = findViewById(R.id.dogsButton);
        Button catsButton = findViewById(R.id.catsButton);
        CardView dogItemCard1 = findViewById(R.id.dogItemCard1);
        CardView dogItemCard2 = findViewById(R.id.dogItemCard2);
        CardView catItemCard1 = findViewById(R.id.catItemCard1);
        CardView catItemCard2 = findViewById(R.id.catItemCard2);

// Show Dogs section when Dogs button is clicked
        dogsButton.setOnClickListener(v -> {
            dogItemCard1.setVisibility(View.VISIBLE);
            dogItemCard2.setVisibility(View.VISIBLE);
            catItemCard1.setVisibility(View.GONE);
            catItemCard2.setVisibility(View.GONE);
        });

// Show Cats section when Cats button is clicked
        catsButton.setOnClickListener(v -> {
            dogItemCard1.setVisibility(View.GONE);
            dogItemCard2.setVisibility(View.GONE);
            catItemCard1.setVisibility(View.VISIBLE);
            catItemCard2.setVisibility(View.VISIBLE);
        });

        dogsButton.setOnClickListener(v -> {
            // Toggle section visibility
            dogItemCard1.setVisibility(View.VISIBLE);
            dogItemCard2.setVisibility(View.VISIBLE);
            catItemCard1.setVisibility(View.GONE);
            catItemCard2.setVisibility(View.GONE);

            // Change button background color to indicate active section
            dogsButton.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.selectedColor));
            catsButton.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.defaultColor));
        });

        catsButton.setOnClickListener(v -> {
            // Toggle section visibility
            dogItemCard1.setVisibility(View.GONE);
            dogItemCard2.setVisibility(View.GONE);
            catItemCard1.setVisibility(View.VISIBLE);
            catItemCard2.setVisibility(View.VISIBLE);

            // Change button background color to indicate active section
            catsButton.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.selectedColor));
            dogsButton.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.defaultColor));
        });

    }
}