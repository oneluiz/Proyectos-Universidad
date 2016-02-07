/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author laboratorio
 */
import java.util.Scanner;
public class Calculadora {
    static Scanner entrada = new Scanner(System.in);
    static public int a = 0, c = 0;
    static String b = "";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("DIGITE EL PRIMER VALOR");
        a = entrada.nextInt();
   
        System.out.println("DIGITE EL TIPO DE OPERACION QUE DESEA REALIZAR");
        b = entrada.next();

        System.out.println("DIGITE EL SEGUNDO VALOR");
        c = entrada.nextInt();
        System.out.println(a+b+c+" = ");
    }
}
