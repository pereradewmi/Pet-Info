package com.petinfoApp.petinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FNQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fnq);

        // FAQ Items IDs to loop through
        int[] faqItems = {
                R.id.faqItem1,
                R.id.faqItem2  // Add more if you have more FAQ items
//                R.id.faqItem3
        };

        // Loop through each FAQ item
        for (int faqItemId : faqItems) {
            // Find the views for each FAQ item
            CardView faqItem = findViewById(faqItemId);
            TextView answerText = findViewById(getAnswerTextId(faqItemId));
            ImageView arrowIcon = findViewById(getArrowIconId(faqItemId));

            // Set click listener for each FAQ item
            faqItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    toggleAnswer(answerText, arrowIcon);
                }
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
                    Intent intent = new Intent(FNQ.this, Home.class); // Replace 'CurrentActivity' with the name of your activity
                    startActivity(intent);
                }
            });

            profileIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Navigate to the Home activity
                    Intent intent = new Intent(FNQ.this, MainProfile.class); // Replace 'CurrentActivity' with the name of your activity
                    startActivity(intent);
                }
            });

            helpIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Navigate to the Home activity
                    Intent intent = new Intent(FNQ.this, MainHelp.class); // Replace 'CurrentActivity' with the name of your activity
                    startActivity(intent);
                }
            });

            settingIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Navigate to the Home activity
                    Intent intent = new Intent(FNQ.this, MainSetting.class); // Replace 'CurrentActivity' with the name of your activity
                    startActivity(intent);
                }
            });

        }
    }

    // Toggle the visibility of the answer and change the arrow icon
    private void toggleAnswer(TextView answerText, ImageView arrowIcon) {
        if (answerText.getVisibility() == View.GONE) {
            answerText.setVisibility(View.VISIBLE);

            arrowIcon.setImageResource(R.drawable.arrow_up_icon); // Change icon to up arrow
        } else {
            answerText.setVisibility(View.GONE);
            arrowIcon.setImageResource(R.drawable.arrow_down_icon); // Change icon to down arrow
        }
    }

    // Helper methods to get the correct IDs for each FAQ item using if-else instead of switch
    private int getAnswerTextId(int faqItemId) {
        if (faqItemId == R.id.faqItem1) return R.id.answerText1;
        else if (faqItemId == R.id.faqItem2) return R.id.answerText2;
//        else if (faqItemId == R.id.faqItem3) return R.id.answerText3;
        else return 0;  // Return 0 or handle case for undefined FAQ items
    }

    private int getArrowIconId(int faqItemId) {
        if (faqItemId == R.id.faqItem1) return R.id.arrowIcon1;
        else if (faqItemId == R.id.faqItem2) return R.id.arrowIcon2;
//        else if (faqItemId == R.id.faqItem3) return R.id.arrowIcon3;
        else return 0;  // Return 0 or handle case for undefined FAQ items
    }
}
