package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Areas extends AppCompatActivity {
    private ListView lista_areas;
    private String opcion_area[];
    private ArrayAdapter<String> adapter;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);

        lista_areas=findViewById(R.id.lstAreas);
        opcion_area=getResources().getStringArray(R.array.opciones_area);
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,opcion_area);
        lista_areas.setAdapter(adapter);
        lista_areas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent=new Intent(Areas.this, Area_Cuadrados.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent=new Intent(Areas.this, Area_Rectangulos.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent=new Intent(Areas.this, Area_Triangulos.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent=new Intent(Areas.this, Area_Circulos.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}