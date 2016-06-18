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
public class swite extends habitacion{
    String incluye;
    double precio;
    
    public swite(){
        super("", "", 0);
    }
    
    public swite(String num, String nom, int num_cama, String incluye, double precio){
        super(num, nom, num_cama);
        this.incluye    = incluye;
        this.precio     = precio;
    }

    public String getIncluye() {
        return incluye;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum_cama() {
        return num_cama;
    }

    public void setIncluye(String incluye) {
        this.incluye = incluye;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNum_cama(int num_cama) {
        this.num_cama = num_cama;
    }

}
