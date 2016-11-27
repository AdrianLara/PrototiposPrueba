package com.example.adria.grupo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Chapter1 extends AppCompatActivity {
    ArrayList<String> opcionList;
    ListView drawerlayout;
    Button chapters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);

        drawerlayout = (ListView)findViewById(R.id.drawerLayout);
        opcionList= new ArrayList<String>();
        opcionList.add("Ejercicio 1");
        opcionList.add("Ejercicio 2");
        opcionList.add("Ejercicio 3");
        opcionList.add("Ejercicio 4");
        opcionList.add("Ejercicio 5");
        opcionList.add("Ejercicio 6");
        opcionList.add("Ejercicio 7");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,opcionList);
        drawerlayout.setAdapter(adapter);
        drawerlayout.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                String opc = opcionList.get(i);
                Toast.makeText(Chapter1.this,"",Toast.LENGTH_SHORT ).show();
            }
        });


    }
}
