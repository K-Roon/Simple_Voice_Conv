package com.example.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoiseActiviy extends AppCompatActivity {
    Button btneng;
    Button btnch;
    Button btnjp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise_activiy);

        btneng = findViewById(R.id.btneg);
        btnch = findViewById(R.id.btnch);
        btnjp = findViewById(R.id.btnjp);

        btneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), english.class);
                intent.putExtra("lang", "en");
                startActivity(intent);
            }
        });
        btnch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), english.class);
                intent.putExtra("lang", "ch");
                startActivity(intent);
            }
        });
        btnjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), english.class);
                intent.putExtra("lang", "jp");
                startActivity(intent);
            }
        });
    }
}
