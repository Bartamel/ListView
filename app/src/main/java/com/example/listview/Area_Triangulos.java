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
        String op = "Area Triángulo";
        String area;
        float bas;
        float altur;
        operaciones o;

        medidas = new String[3];
        bas = Float.parseFloat(base.getText().toString());
        altur = Float.parseFloat(altura.getText().toString());
        medidas[0] = String.format("Base: %.2f", bas);
        medidas[1] = String.format("Altura %.2f", altur);
        medidas[2] = "";
        area = Float.toString((bas * altur) / 2);
        o =  new operaciones(op, medidas, area);
        o.guardar();
        resultado.setText(area);
    }
    public void Limpiar(View v){
        base.setText("");
        altura.setText("");
        resultado.setText("");
        base.requestFocus();
    }
}