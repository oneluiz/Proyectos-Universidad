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
    static int compra = 0;
    static int des5 = 5;
    static int des10 = 10;
    static int des20 = 20;
    static int des25 = 25;
    
    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("Sistema de Facturación \n");
        System.out.println("Digite el monto de la compra");
        compra = scanner.nextInt();
         
        if(compra < 500 ){
            // Sin descuento
            System.out.println("Monto a pagar $"+compra);
        }else if(compra >= 500 && compra <= 1000){
            
            // descuento 5%
            int Des = compra*des5/100;
            int total = compra-Des;
            
            System.out.println("Descuento del %"+ des5);
            System.out.println("Descuento $"+ Des);
            System.out.println("Monto a pagar $"+ total);
            
        }else if(compra > 1000 && compra <= 7000){
            
            // descuento 10%
            int Des = compra*des10/100;
            int total = compra-Des;
            
            System.out.println("Descuento del %"+ des10);
            System.out.println("Descuento $"+ Des);
            System.out.println("Monto a pagar $"+ total);
            
        }else if(compra > 7000 && compra <= 15000){
            
            // descuento 20%
            int Des = compra*des20/100;
            int total = compra-Des;
            
            System.out.println("Descuento del %"+ des20);
            System.out.println("Descuento $"+ Des);
            System.out.println("Monto a pagar $"+ total);
            
        }else if(compra > 15000){
            
            // descuento 25%
            int Des = compra*des25/100;
            int total = compra-Des;
            
            System.out.println("Descuento del %"+ des25);
            System.out.println("Descuento $"+ Des);
            System.out.println("Monto a pagar $"+ total);
            
        }else{
            System.out.println("Ha ocurrido un error en el sistema");
        }
    }
   
}
