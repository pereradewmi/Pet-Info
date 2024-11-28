//package com.petinfoApp.petinfo;
//
//public class BottomBar {
//}

package com.petinfoApp.petinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BottomBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.bottom_bar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView img = findViewById(R.id.home_icon);
        img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(BottomBar.this, Home.class);
                startActivity(intent);
            }
        });
        ImageView img1 = findViewById(R.id.help_icon);
        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(BottomBar.this, MainHelp.class);
                startActivity(intent);
            }
        });
        ImageView img2 = findViewById(R.id.setting_icon);
        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(BottomBar.this, MainSetting.class);
                startActivity(intent);
            }
        });
        ImageView img3 = findViewById(R.id.profile_icon);
        img3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(BottomBar.this, MainProfile.class);
                startActivity(intent);
            }
        });
    }
}