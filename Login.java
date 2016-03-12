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
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario = "Luis";
        String user    = "";
        String clave = "Luis";
        String pass = "";
        int contador = 3;
        int n = 1;
        
        while(clave.equals(pass) == false){
            user = JOptionPane.showInputDialog("Digite su usuario", "Por favor escriba su usuario");
            pass = JOptionPane.showInputDialog("Digite su clave", "Por favor escriba su clave");
            if(clave.equals(pass) == false || usuario.equals(user) == false){
                JOptionPane.showMessageDialog(null, "Clave o usuario son incorrectos, te quedan "+contador+" intentos", "Resultado", JOptionPane.WARNING_MESSAGE);
                
                n = n+1;
                --contador;
                if(n > 3){
                    JOptionPane.showMessageDialog(null, "Se ha bloqueado el acceso", "Acceso Bloqueado", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }else{
                int confirmado = JOptionPane.showConfirmDialog(null,"Clave correcta, ¿Ir al panel de cuenta?");

                if (JOptionPane.OK_OPTION == confirmado){
                    JOptionPane.showMessageDialog(null, "Bienvenido: "+usuario+ " y Tu contraseña es: "+clave);
                }else{
                    JOptionPane.showMessageDialog(null, "saliendo del sistema....");
                    System.exit(0);
                }
            }
        }
    }
}
