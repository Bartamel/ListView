package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Area_Rectangulos extends AppCompatActivity {
    private EditText base;
    private EditText altura;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_rectangulo);
        base = findViewById(R.id.lbl_base_rectangulo);
        altura = findViewById(R.id.lbl_altura_rectangulo);
        resultado = findViewById(R.id.lbl_resultados_rectan);
    }
    public void calcular(View v){
        String medidas[];
        String op = "Area Rectangulo";
        String area;
        float bas;
        float altur;
        operaciones o;

        medidas = new String[2];
        bas = Float.parseFloat(base.getText().toString());
        altur = Float.parseFloat(altura.getText().toString());
        medidas[0] = String.format("Base: %.2f", bas);
        medidas[1] = String.format("Altura %.2f", altur);
        area = Float.toString((bas * altur) );
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