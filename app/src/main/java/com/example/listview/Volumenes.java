package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.layout.simple_list_item_1;

public class Volumenes extends AppCompatActivity {
    private ListView lista_volumenes;
    private String opcion_volumen[];
    private ArrayAdapter<String> adapter;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes);

        lista_volumenes = findViewById(R.id.lstvolumen);
        opcion_volumen = getResources().getStringArray(R.array.opciones_volumen);
        adapter = new ArrayAdapter<>(this, simple_list_item_1, opcion_volumen);
        lista_volumenes.setAdapter(adapter);
        lista_volumenes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent = new Intent(Volumenes.this, Vol_Esfera.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Volumenes.this, Vol_Cilindro.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Volumenes.this, Vol_Cono.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Volumenes.this, Vol_Cubo.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}