package com.example.listview;

public class operaciones {
    private String datos[];
    private String operacion;
    private String resultado;

    public operaciones(String operacion, String datos[], String resultado){
        this.operacion = operacion;
        this.datos = datos;
        this.resultado = resultado;
    }

    public String[] getDatos() {
        return datos;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public void guardar(){Datos.guardar(this);}
}
