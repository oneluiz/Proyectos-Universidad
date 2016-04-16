/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author laboratorio
 */
public class Examen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        LlenarArreglo();
        OrdenarArreglo();
        Imprime();
    }

    static int [][] arreglo = new int[2][5];

    static void LlenarArreglo(){
        int Aleatorio;
        for (int[] arreglo1 : arreglo) {
            for (int posicion = 0; posicion < arreglo1.length; posicion++) {
                Aleatorio=(int)(Math.random()*100+1);
                if(Aleatorio%2==0){
                    // valores par
                    arreglo[0][posicion]=Aleatorio;
                }else{
                    // valores impar
                    arreglo[1][posicion]=Aleatorio;
                }
            }
        }
    }

    static void OrdenarArreglo(){
        // ordenamos los valores pares
        Arrays.sort(arreglo[0]);
        // ordenamos los valores impares
        Arrays.sort(arreglo[1]);
    }

    static void Imprime(){
        for(int i=0;i<arreglo.length;i++){
            // Imprime los titulos
            if(i==0){
                System.out.println("\t--- Números Pares ---");
            }else if(i==1){
                System.out.println("\n \t--- Números Impares ---");
            }

            // Imprime los valores
            for(int j=0;j<arreglo[i].length;j++){
                System.out.print("Arreglo Aleatorio["+i+"]["+j+"] : "+arreglo[i][j]);
                System.out.println("");
            }
        }
    }
}
