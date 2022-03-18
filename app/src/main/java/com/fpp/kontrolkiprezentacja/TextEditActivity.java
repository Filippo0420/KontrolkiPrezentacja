package com.fpp.kontrolkiprezentacja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TextEditActivity extends AppCompatActivity {

    private EditText et;
    private Button klik;
    private String pobrany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_edit);

        et = findViewById(R.id.wprowadzTekst);
        klik = findViewById(R.id.klik);


        et.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                pobrany = et.getText().toString();
                klik.setText(pobrany);

            }
        });

        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(TextEditActivity.this, );
                //startActivity(intent);
            }
        });

    }
}