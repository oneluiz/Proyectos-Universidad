/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;
/**
 *
 * @author laboratorio
 */
public class EstructuraIf {
    static Scanner valores = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("DIGITE UN VALOR");
        int var1 = valores.nextInt();
        
        System.out.println("DIGITE OTRO VALOR");
        int var2 = valores.nextInt();
        
        if(var1 > var2){
            System.out.println(var1+" es mayor a "+var2);
        }else if(var1 < var2){
            System.out.println(var1+" es menor a "+var2);
        }else if(var1 == var2){
            System.out.println("Son Iguales");
        }else{
            System.out.println("No existe ninun valor");
        }
    }
}
