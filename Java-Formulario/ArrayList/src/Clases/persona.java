/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
public class persona {
    String cedula = "";
    String nombre = "";
    String apellidos = "";
    
    public persona(){
    
    }
    public persona(String cedula, String nombre, String apellido){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellido;
    }
       
    // nombre
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
       
    // Apellidos
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
       
    // cedula
    public String getCedula(){
        return cedula;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
}
