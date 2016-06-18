/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author laboratorio
 */
public abstract class habitacion {
    
    String numero, nombre;
    int num_cama;
    
    public habitacion(){
    }
    
    public habitacion(String numero, String nombre, int num_cama){
        this.numero     = numero;
        this.nombre     = nombre;
        this.num_cama   = num_cama;
        
    }
}
