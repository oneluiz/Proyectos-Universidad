/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen4;
import java.util.Scanner;

/**
 *
 * @author laboratorio
 */
public class Examen4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {  
           
         int cant, num, pares=0, impares=0;           
         System.out.print("Cuantos numeros desea ingresar: ");  
         Scanner scanner = new Scanner(System.in);  
         cant = scanner.nextInt();  
 
        for(int i=1; i<=cant; i++){  
            System.out.print("Ingresar numero " + i + " de " + cant + ":  ");  
            num =  (new Scanner(System.in)).nextInt();  
            if(num%2 == 0)  
                pares++;  
            else  
                impares++;               
        }
         
        System.out.println("\nCantidad de numeros pares: " + pares);  
        System.out.println("Cantidad de numeros impares: " + impares);           
     }         
} 
