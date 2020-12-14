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
        medidas = new String[2];
        float rad, pi;
        String area;
        String op = getString(R.string.area_circulo);
        operaciones o;

        if (validar()) {
            rad = Float.parseFloat(radio.getText().toString());
            pi = (float) Math.PI;
            medidas[0] = String.format(getString(R.string.salida_radio)+" %.2f", rad);
            medidas[1] = "";
            area = Float.toString(pi * rad * rad);
            o = new operaciones(op, medidas, area);
            o.guardar();
            resultado.setText(area);
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