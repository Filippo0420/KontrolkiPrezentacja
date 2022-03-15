package com.fpp.kontrolkiprezentacja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class SeekbarActivity extends AppCompatActivity {

    private SeekBar przesuwadlo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        przesuwadlo = findViewById(R.id.przesun);
        przesuwadlo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 100){
                    Intent intent = new Intent(SeekbarActivity.this, ImagebuttonActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}