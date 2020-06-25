package com.unicauca.clubpark.negocio;
/**
 *
 * @author Javier
 */
public class Parqueadero {
    
    private String nombre;
    private String puestosLibres;
    private String puestosOcupados;

    public Parqueadero(String nombre, String puestosLibres, String puestosOcupados) {
        this.nombre = nombre;
        this.puestosLibres = puestosLibres;
        this.puestosOcupados = puestosOcupados;
    }

   public Parqueadero(){
       this.nombre= "";
       this.puestosLibres= "";
       this.puestosOcupados="";
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuestosLibres() {
        return puestosLibres;
    }

    public void setPuestosLibres(String puestosLibres) {
        this.puestosLibres = puestosLibres;
    }

    public String getPuestosOcupados() {
        return puestosOcupados;
    }

    public void setPuestosOcupados(String puestosOcupados) {
        this.puestosOcupados = puestosOcupados;
    }
    
   
    
    
}
