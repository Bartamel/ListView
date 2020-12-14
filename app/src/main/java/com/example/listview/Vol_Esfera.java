package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Vol_Esfera extends AppCompatActivity {
    private EditText radio;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol__esfera);
        radio = findViewById(R.id.lbl_radio_esfera);
        resultado = findViewById(R.id.lbl_resul_esfera);
    }
    public void calcular(View v){
        String medidas[];
        String op = getString(R.string.volumen_esfera);
        String volumen;
        float rad;
        float pi;
        operaciones o;
        medidas = new String[2];

        if (validar()) {
            rad = Float.parseFloat(radio.getText().toString());
            pi = (float) Math.PI;
            volumen = Float.toString(((4 / 3) * (pi * rad * rad * rad)));
            medidas[0] = String.format(getString(R.string.salida_radio)+" %.2f", rad);
            medidas[1] = String.format("Pi: %.2f", pi);
            o = new operaciones(op, medidas, volumen);
            o.guardar();
            resultado.setText(volumen);
        }
    }
    public boolean validar(){
        if (radio.getText().toString().isEmpty()){
            radio.setError(getString(R.string.error_vacio));
            radio.requestFocus();
            return false;
        }
        return true;
    }
    public void Limpiar(View v){
        radio.setText("");
        resultado.setText("");
        radio.requestFocus();
    }
}