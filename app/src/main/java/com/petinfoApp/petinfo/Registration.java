package com.petinfoApp.petinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        // Load animations
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation slideInLeft = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        Animation slideInRight = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        Animation slideInBottom = AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom);

        // Apply animations to views
        TextView mainText = findViewById(R.id.mainText);
        EditText fullnameField = findViewById(R.id.editFullname);
        EditText contactNumField = findViewById(R.id.editUsercnum);
        EditText emailField = findViewById(R.id.editUseremail);
        EditText passwordField = findViewById(R.id.editPassword);
        CheckBox termsCheckBox = findViewById(R.id.checkBTnC);
        Button registerButton = findViewById(R.id.btn_register);
        FrameLayout mainLayout = findViewById(R.id.main);

        // Start animations
        mainLayout.startAnimation(fadeIn);
        mainText.startAnimation(slideInLeft);
        fullnameField.startAnimation(slideInLeft);
        contactNumField.startAnimation(slideInLeft);
        emailField.startAnimation(slideInLeft);
        passwordField.startAnimation(slideInLeft);
        termsCheckBox.startAnimation(slideInBottom);
        registerButton.startAnimation(slideInRight);

        // Apply window insets if necessary
        ViewCompat.setOnApplyWindowInsetsListener(mainLayout, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        Button btn = findViewById(R.id.btn_loginR);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Registration.this, Login.class);
                startActivity(intent);
            }
        });
        Button btn2 = findViewById(R.id.btn_register);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Registration.this, Home.class);
                startActivity(intent);
            }
        });

    }
}
