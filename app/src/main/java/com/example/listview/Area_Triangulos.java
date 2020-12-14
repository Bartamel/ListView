package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Area_Triangulos extends AppCompatActivity {
    private EditText base;
    private EditText altura;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_triangulo);
        base = findViewById(R.id.lbl_base_triang);
        altura = findViewById(R.id.lbl_alt_triang);
        resultado = findViewById(R.id.lblresultriangulo);
    }
    public void calculos_triangulo(View v){
        String medidas[];
        String op = getString(R.string.area_triangulo);
        String area;
        float bas;
        float altur;
        operaciones o;
        medidas = new String[2];
        if (validar()) {
            bas = Float.parseFloat(base.getText().toString());
            altur = Float.parseFloat(altura.getText().toString());
            medidas[0] = String.format(getString(R.string.salida_base)+" %.2f", bas);
            medidas[1] = String.format(getString(R.string.salida_altura)+" %.2f", altur);
            area = Float.toString((bas * altur) / 2);
            o = new operaciones(op, medidas, area);
            o.guardar();
            resultado.setText(area);
        }
    }
    public boolean validar(){
        if (base.getText().toString().isEmpty()){
            base.setError(getString(R.string.error_vacio));
            base.requestFocus();
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
        base.setText("");
        altura.setText("");
        resultado.setText("");
        base.requestFocus();
    }
}