/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author ivand
 */
public class Pais {
    private String nombre;
    private String ISO;
    
    public Pais(String nombre, String ISO){
        this.nombre = nombre;
        this.ISO = ISO;
    }

    public String getNombre() {
        return nombre;
    }

    public String getISO() {
        return ISO;
    }
}
