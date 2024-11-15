package com.petinfoApp.petinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FNQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fnq);

        // Find views for the first FAQ item
        CardView faqItem1 = findViewById(R.id.faqItem1);
        TextView answerText1 = findViewById(R.id.answerText1);
        ImageView arrowIcon1 = findViewById(R.id.arrowIcon1);

        // Set click listener for FAQ item
        faqItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerText1.getVisibility() == View.GONE) {
                    answerText1.setVisibility(View.VISIBLE);
                    arrowIcon1.setImageResource(R.drawable.car_ui_recyclerview_ic_up); // Change icon to up arrow
                } else {
                    answerText1.setVisibility(View.GONE);
                    arrowIcon1.setImageResource(R.drawable.car_ui_recyclerview_ic_down); // Change icon to down arrow
                }
            }
        });
    }
}
