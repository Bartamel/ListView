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
        String op = getString(R.string.area_cuadrado);
        operaciones o;
        lado = new String[2];
        if(validar()) {
            lados = Float.parseFloat(lad.getText().toString());
            lado[0] = String.format(getString(R.string.salida_lado)+" %.2f", lados);
            lado[1] = "";
            area = Float.toString(lados * lados);
            System.out.println(area);
            o = new operaciones(op, lado, area);
            o.guardar();
            resultado.setText(area);
        }
    }
    public boolean validar(){
        if(lad.getText().toString().isEmpty()){
            lad.setError(getString(R.string.error_vacio));
            lad.requestFocus();
            return false;
        }
        return true;
    }
    public void Limpiar(View v){
        lad.setText("");
        resultado.setText("");
        lad.requestFocus();
    }
}