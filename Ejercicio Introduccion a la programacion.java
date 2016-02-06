/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author laboratorio
 */
import java.util.Scanner;

public class Ejercicio {
    static Scanner entrada = new Scanner(System.in);
    static public int valor = 0, b = 0, c = 0, d= 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("DIGITE UN VALOR");
        valor = entrada.nextInt();
        for(int v = 0; v < 10; v++ ){
            System.out.println(v);
            if( v == 4){
                b = valor + v;
                System.out.println("valor es ("+b+")");
            }
  
            if(v == 7){
                c = valor + v;
                System.out.println("valor es ("+c+")");
            }

            if(v == 9){
                d = b + c;
                System.out.println("la suma de los valores es ("+d+")");
            }
        }
    }
}
