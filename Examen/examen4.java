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
        
        // Declaracion de valores 
        int cant, num, SumaP= 0, SumaI= 0,pares = 0 , impares = 0;

        System.out.print("Cuantos numeros desea ingresar: ");  
        Scanner scanner = new Scanner(System.in);  
        cant = scanner.nextInt();  

        for(int i=1; i<=cant; i++){
            System.out.print("Ingresar numero " + i + " de " + cant + ":  ");  
            num =  new Scanner(System.in).nextInt();
            if(num%2 == 0){
                SumaP = SumaP + num;
            }else{
                SumaI = SumaI + num;
            }
        }

        System.out.println("\nSuma de numeros pares: " + SumaP);  
        System.out.println("Suma de numeros impares: " + SumaI);           
    }         
}
