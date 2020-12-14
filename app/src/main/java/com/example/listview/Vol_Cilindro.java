package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Vol_Cilindro extends AppCompatActivity {
    private EditText radio;
    private EditText altura;
    private TextView resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol__cilindro);
        radio = findViewById(R.id.lbl_radio_cilindro);
        altura = findViewById(R.id.lbl_altura_cilindro);
        resultados = findViewById(R.id.lbl_resultados_cilindro);
    }
    public void calcular(View v){
        String medidas[];
        String op = "Volumen Cilindro";
        String volumen;
        float rad;
        float alt;
        float pi;
        operaciones o;

        medidas = new String[2];
        rad = Float.parseFloat(radio.getText().toString());
        alt = Float.parseFloat(altura.getText().toString());
        pi = (float) Math.PI;
        volumen = Float.toString((pi*alt*rad*rad));
        medidas[0] = String.format("Radio %.2f", rad);
        medidas[1] = String.format("Altura %.2f", alt);
        o = new operaciones(op, medidas, volumen);
        o.guardar();
        resultados.setText(volumen);
    }
    public void Limpiar(View v){
        radio.setText("");
        altura.setText("");
        resultados.setText("");
        radio.requestFocus();
    }
}