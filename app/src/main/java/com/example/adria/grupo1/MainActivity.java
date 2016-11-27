package com.example.adria.grupo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button chapters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        chapters = (Button)findViewById(R.id.btnCh);
        chapters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chapter = new Intent (MainActivity.this, Chapters.class);
                startActivity(chapter);
            }
        });

    }
}
