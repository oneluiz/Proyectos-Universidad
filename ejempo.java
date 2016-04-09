/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author laboratorio
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = {{2,4,5}, {5,6,7}};
        
        for (int i = 0; i< matriz.length; i++){
            //System.out.println();
            for (int j = 0; j<3; j++){
                System.out.println(matriz[i][j]+" ");
            }
        }
    }
    
}
