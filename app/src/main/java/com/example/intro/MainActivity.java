package com.example.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btnstart;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnstart = findViewById(R.id.btnstart);
         imageButton = findViewById(R.id.imageButton);

         btnstart.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getApplicationContext(), ChoiseActiviy.class);
                 startActivity(intent);
             }

         });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChoiseActiviy.class);
                startActivity(intent);
            }

        });



    }
}
