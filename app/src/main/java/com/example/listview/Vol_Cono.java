package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Vol_Cono extends AppCompatActivity {
    private EditText radio;
    private EditText altura;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol__cono);
        radio = findViewById(R.id.lbl_radio_cono);
        altura = findViewById(R.id.lbl_Altura_Cono);
        resultado = findViewById(R.id.lbl_resul_cono);
    }
    public void calcular(View v){
        String medidas[];
        String op = getString(R.string.volumen_cono);
        String volumen;
        float rad;
        float pi;
        float alt;
        operaciones o;
        medidas = new String[2];

        if (validar()) {
            rad = Float.parseFloat(radio.getText().toString());
            alt = Float.parseFloat(altura.getText().toString());
            pi = (float) Math.PI;
            volumen = Float.toString(((1 / 3) * (pi * alt * rad * rad)));
            medidas[0] = String.format(getString(R.string.salida_radio)+" %.2f", rad);
            medidas[1] = String.format(getString(R.string.salida_altura)+" %.2f", alt);
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
        if (altura.getText().toString().isEmpty()){
            altura.setError(getString(R.string.error_vacio));
            altura.requestFocus();
            return false;
        }
        return true;
    }
    public void Limpiar(View v){
        radio.setText("");
        altura.setText("");
        resultado.setText("");
        radio.requestFocus();
    }
}