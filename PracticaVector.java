/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int [] numeros = new int[5];
       llenarVector(numeros);
       mostrarVector(numeros);
       MostrarSuma(numeros);
       MostrarResta(numeros);
       MostrarPromedio(numeros);
    }
    
    public static void llenarVector (int [] numeros){
        for(int i=0;i<numeros.length;i++){
            String num = JOptionPane.showInputDialog("Ingrese el numero para la posicion:"+(i+1));
            int numero=Integer.parseInt(num);
            numeros[i]=numero;
        }
    }

     public static void mostrarVector(int [] numeros){
        String vector = "";
        for(int i=0;i<numeros.length;i++){
        
           vector += numeros[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, vector); 
    }

    public static void mostrarVector2 (int [] numeros){
        for(int  elemento:numeros){
            System.out.println(elemento);                   
        }
    }

    public static int Suma(int [] numeros){
        int suma=0;
        for (int i=0; i< numeros.length ; i++){
            suma+=numeros[i];
        }
        return suma;
    }
    
    public static double Resta(int [] numeros){
        int resta=0;
        for (int i=0; i< numeros.length ; i++){
            resta-=numeros[i];
        }
        return resta;
    }
    
    public static int Promedio(int [] numeros){
        int suma=0;
        for (int i=0; i< numeros.length ; i++){
            suma+=numeros[i];
        }
        return suma/5;
    }

    public static void MostrarSuma(int [] numeros){
        JOptionPane.showMessageDialog(null,  "El resultado de la suma "+Suma(numeros));
    }

    public static void MostrarResta(int [] numeros){
        JOptionPane.showMessageDialog(null,  "El resultado de la resta "+Resta(numeros));
    }

    public static void MostrarPromedio(int [] numeros){
        JOptionPane.showMessageDialog(null,  "El promedio de los numeros "+Promedio(numeros));
    }
}
