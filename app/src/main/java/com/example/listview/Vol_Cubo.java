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
        String op = getString(R.string.volumen_cubo);
        String volumen;
        float lad;
        operaciones o;
        medidas = new String[2];

        if (validar()) {
            lad = Float.parseFloat(lado.getText().toString());
            volumen = Float.toString((lad * lad * lad));
            medidas[0] = String.format(getString(R.string.salida_altura)+" %.2f", lad);
            medidas[1] = "";
            o = new operaciones(op, medidas, volumen);
            o.guardar();
            resultado.setText(volumen);
        }
    }
    public boolean validar(){
        if (lado.getText().toString().isEmpty()){
            lado.setError(getString(R.string.error_vacio));
            lado.requestFocus();
            return false;
        }
        return true;
    }
    public void Limpiar(View v){
        lado.setText("");
        resultado.setText("");
        lado.requestFocus();
    }
}