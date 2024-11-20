package com.petinfoApp.petinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.api.Page;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Animate Profile Picture on Click
        ImageView userProfile = findViewById(R.id.userProfile);
        userProfile.setOnClickListener(view -> {
            Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale);
            view.startAnimation(scaleAnimation);
        });

        // Animate Category Layout with Slide Animation
        View linearLayout = findViewById(R.id.linearLayout);
        Animation slideInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in);
        linearLayout.startAnimation(slideInAnimation);

        // Slide-Up Animation for Frames
        View frameLayout1 = findViewById(R.id.frameLayout);
        View frameLayout2 = findViewById(R.id.txt_faq);
        Animation slideUpAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        frameLayout1.startAnimation(slideUpAnimation);
        frameLayout2.startAnimation(slideUpAnimation);

        Button btn = findViewById(R.id.viewCategory);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Home.this, CategeryNew.class);
                startActivity(intent);
            }
        });

        ImageView userProfile2 = findViewById(R.id.userProfile);
        userProfile2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });

        FrameLayout careTipsFrame = findViewById(R.id.frameLayout);
        careTipsFrame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Home.this, NewCareTips.class);
                startActivity(intent);
            }
        });

        FrameLayout careTipsFrame2 = findViewById(R.id.frameLayout2);
        careTipsFrame2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Home.this, FNQ.class);
                startActivity(intent);
            }
        });
//        FrameLayout careTipsFrame = findViewById(R.id.frameLayout);
//        careTipsFrame.setOnClickListener(view -> {
//            @Override
//            Intent intent = new Intent(Home.this, CareTips.class);
//            startActivity(intent);
//        });
    }
}
