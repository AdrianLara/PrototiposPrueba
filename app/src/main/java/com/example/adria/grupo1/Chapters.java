package com.example.adria.grupo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chapters extends AppCompatActivity {
    Button menu;
    Button ch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);
        menu = (Button)findViewById(R.id.btnMenu);
        ch1 = (Button)findViewById(R.id.btnCh1);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch1 = new Intent(Chapters.this,Chapter1.class);
                startActivity(ch1);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu = new Intent(Chapters.this,MainActivity.class);
                startActivity(menu);
            }
        });
    }
}
