package com.petinfoApp.petinfo;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NewCareTips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_care_tips);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        LinearLayout layout = findViewById(R.id.careTip1);
        layout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(NewCareTips.this, CareTipView.class);
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
                Intent intent = new Intent(NewCareTips.this, Home.class); // Replace 'CurrentActivity' with the name of your activity
                startActivity(intent);
            }
        });
    }
}