package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Area_Circulos extends AppCompatActivity {
    private EditText radio;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_circulo);
        radio = findViewById(R.id.lbl_radio);
        resultado = findViewById(R.id.lbl_resul_circulo);
    }
    public void Calcular(View v){
        String medidas[];
        medidas = new String[3];
        float rad, pi;
        String area;
        String op = "Area Circulo";
        operaciones o;

        rad = Float.parseFloat(radio.getText().toString());
        pi = (float) Math.PI;
        medidas[0] = String.format("Radio: %.2f",rad);
        medidas[1] = String.format("Pi: %.2f",pi);
        medidas[2] = "";
        area = Float.toString(pi*rad*rad);
        o = new operaciones(op, medidas, area);
        o.guardar();
        resultado.setText(area);

    }
    public void Limpiar(View v){
        radio.setText("");
        resultado.setText("");
        radio.requestFocus();
    }
}