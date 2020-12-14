package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Area_Cuadrados extends AppCompatActivity {
    private EditText lad;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_cuadrados);
        lad=findViewById(R.id.lblvalor);
        resultado=findViewById(R.id.lblresultriangulo);
    }
    public void calculos(View v){
        String lado[];
        float lados;
        String area;
        String op = "Area Cuadrado";
        operaciones o;

        lado = new String[3];
        lados = Float.parseFloat(lad.getText().toString());
        lado[0] = String.format("Lado: %.2f", lados);
        lado[1] = "";
        lado[2] = "";
        area = Float.toString(lados * lados);
        System.out.println(area);
        o = new operaciones(op, lado, area);
        o.guardar();
        resultado.setText(area);
    }
    public void Limpiar(View v){
        lad.setText("");
        resultado.setText("");
        lad.requestFocus();
    }
}