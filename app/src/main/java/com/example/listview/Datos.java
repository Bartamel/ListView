package com.example.listview;

import java.util.ArrayList;

public class Datos {
    private static ArrayList<operaciones>  operaciones= new ArrayList();

    public static void guardar(operaciones o){operaciones.add(o);}
    public static ArrayList<operaciones> obtener(){ return operaciones;}

}
