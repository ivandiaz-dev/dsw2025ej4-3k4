/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import domain.Pais;


public class PaisViewModel {
    private  String nombre;
    private String codigoIso;

    public PaisViewModel(Pais pais) {
        this.nombre = pais.getNombre();
        this.codigoIso = pais.getCodigoIso();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }
    
    
    @Override
    public String toString(){
        return nombre;
    }
    
}
