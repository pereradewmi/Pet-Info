package com.petinfoApp.petinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CareTipView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_care_tip_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Access the home_icon from the included layout (bottom_bar)
        RelativeLayout bottomNavBar = findViewById(R.id.bottom_nav_bar); // The ID of the <include> tag
        ImageView homeIcon = bottomNavBar.findViewById(R.id.home_icon);
        ImageView profileIcon = bottomNavBar.findViewById(R.id.profile_icon);
        ImageView helpIcon = bottomNavBar.findViewById(R.id.help_icon);
        ImageView settingIcon = bottomNavBar.findViewById(R.id.setting_icon);

        // Set a click listener for the home icon
        homeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the Home activity
                Intent intent = new Intent(CareTipView.this, Home.class); // Replace 'CurrentActivity' with the name of your activity
                startActivity(intent);
            }
        });

        profileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the Home activity
                Intent intent = new Intent(CareTipView.this, MainProfile.class); // Replace 'CurrentActivity' with the name of your activity
                startActivity(intent);
            }
        });

        helpIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the Home activity
                Intent intent = new Intent(CareTipView.this, MainHelp.class); // Replace 'CurrentActivity' with the name of your activity
                startActivity(intent);
            }
        });

        settingIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the Home activity
                Intent intent = new Intent(CareTipView.this, MainSetting.class); // Replace 'CurrentActivity' with the name of your activity
                startActivity(intent);
            }
        });
    }
}