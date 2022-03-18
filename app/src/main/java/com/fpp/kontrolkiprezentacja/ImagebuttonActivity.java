package com.fpp.kontrolkiprezentacja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ImagebuttonActivity extends AppCompatActivity {

    private ImageButton imbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagebutton);


        imbutton = findViewById(R.id.klikObraz);
        imbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ImagebuttonActivity.this, TextEditActivity.class);
                startActivity(intent1);
            }
        });
    }
}