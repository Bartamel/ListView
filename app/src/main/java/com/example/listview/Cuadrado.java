package com.example.listview;

import android.view.View;
import android.widget.Toast;

public class Cuadrado {
    private float lado;
    private float area;

    public Cuadrado(float lado){
        this.lado=lado;
        area = lado*lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }public void calculos(View v){
}}
