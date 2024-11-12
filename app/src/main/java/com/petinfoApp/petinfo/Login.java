package com.petinfoApp.petinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Load animations
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation slideInLeft = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        Animation slideInRight = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        Animation slideInBottom = AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom);

        // Apply animations to views
        TextView mainText = findViewById(R.id.mainText);
        ImageView loginImage = findViewById(R.id.Cview2);
        EditText usernameField = findViewById(R.id.editUsername);
        EditText passwordField = findViewById(R.id.editPassword);
        Button loginButton = findViewById(R.id.btn_login);
        Button registerButton = findViewById(R.id.btn_register);
        FrameLayout mainLayout = findViewById(R.id.main);

        // Start animations
        mainLayout.startAnimation(fadeIn);
        mainText.startAnimation(slideInLeft);
        loginImage.startAnimation(fadeIn);
        usernameField.startAnimation(slideInLeft);
        passwordField.startAnimation(slideInLeft);
        loginButton.startAnimation(slideInRight);
        registerButton.startAnimation(slideInBottom);

        // Optional Edge-to-Edge window insets setup if needed (Uncomment if using WindowInsets)
        // ViewCompat.setOnApplyWindowInsetsListener(mainLayout, (v, insets) -> {
        //     Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //     v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //     return insets;
        // });
        Button btn = findViewById(R.id.btn_register);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Login.this, Registration.class);
                startActivity(intent);
            }
        });
        Button btn2 = findViewById(R.id.btn_login);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Login.this, Home.class);
                startActivity(intent);
            }
        });
    }
}
