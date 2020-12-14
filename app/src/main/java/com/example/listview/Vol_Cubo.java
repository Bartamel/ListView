package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Vol_Cubo extends AppCompatActivity {
    private EditText lado;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol__cubo);
        lado = findViewById(R.id.lbl_lado_cubo);
        resultado = findViewById(R.id.lbl_resultado_cubo);
    }
    public void calcular(View v){
        String medidas[];
        String op = "Volumen Cubo";
        String volumen;
        float lad;
        operaciones o;

        medidas = new String[2];
        lad = Float.parseFloat(lado.getText().toString());
        volumen = Float.toString((lad*lad*lad));
        medidas[0] = String.format("Lados: %.2f", lad);
        medidas[1] = "";
        o = new operaciones(op, medidas, volumen);
        o.guardar();
        resultado.setText(volumen);
    }
    public void Limpiar(View v){
        lado.setText("");
        resultado.setText("");
        lado.requestFocus();
    }
}