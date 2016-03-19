/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroath;
import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class CajeroATH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable
        int saldo = 100000;
        int clave = 1996;
        int pass = 0;
        int opcion = 0;
        int retiro = 0;
        int deposito = 0;
        
        //Propiedad del sistema para salto de línea:
        String NuevaLinea = System.getProperty("line.separator");
        do{
            try{
                pass = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su clave", "Cajero ULatina | Luis Cortés", JOptionPane.PLAIN_MESSAGE));
                if(clave == pass ){
                    boolean salir = false;
                    do{
                       opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite una de la iguientes opciones"+NuevaLinea+"1) Consultar saldo de la Cuenta"+NuevaLinea+"2) Retirar Dinero de la Cuenta"+NuevaLinea+"3) Depositar Dinero a la Cuenta"+NuevaLinea+"4) Terminar Operación", "Cajero ULatina | Luis Cortés", JOptionPane.PLAIN_MESSAGE));
                        switch(opcion){
                            case 1:
                                JOptionPane.showMessageDialog(null, "El saldo de su cuenta es de ¢ "+saldo+"", "Cajero ULatina | Saldo Cuenta", JOptionPane.PLAIN_MESSAGE);
                            break;
                            case 2:
                                do{
                                    retiro = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuanto es el monto que desea retirar?", "Cajero ULatina | Saldo Cuenta", JOptionPane.PLAIN_MESSAGE));
                                    if(saldo<retiro){
                                        JOptionPane.showMessageDialog(null, "El saldo de su cuenta es de es insuficiente", "Cajero ULatina | Saldo Cuenta", JOptionPane.PLAIN_MESSAGE);
                                    }else{
                                        int SaldoActual = saldo-retiro;
                                        JOptionPane.showMessageDialog(null, "Haz realizado un retiro de "+retiro+" y saldo actual es  de ¢ "+SaldoActual+"", "Cajero ULatina | Saldo Cuenta", JOptionPane.PLAIN_MESSAGE);
                                    }
                                }while(saldo<retiro);
                            break;
                            case 3:
                                do{
                                    deposito = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuanto es el monto que desea depositar?", "Cajero ULatina | Saldo Cuenta", JOptionPane.PLAIN_MESSAGE));
                                    int SaldoActual = saldo+deposito;
                                    JOptionPane.showMessageDialog(null, "Haz realizado un depostio de "+deposito+" y saldo actual es  de ¢ "+SaldoActual+"", "Cajero ULatina | Saldo Cuenta", JOptionPane.PLAIN_MESSAGE);
                                }while(saldo<retiro);
                            break;
                            case 4:
                                // Solicitud para salir del sistema
                                if (JOptionPane.showConfirmDialog(null, "Universidad Latina"+NuevaLinea+"Desarrollado por: Luis Cortés Juárez."+NuevaLinea+"¿Quieres Salir del sistema?", "Salir del Sistema | Ulatina", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                                    System.exit(0);
                                }
                            break;
                            default:
                            break;
                        }
                    }while(!salir);
                }else{
                    JOptionPane.showMessageDialog(null, "Su clave es incorrecta o no acepta letras como contraseña", "No puedes ingresar ese tipo de datos", JOptionPane.WARNING_MESSAGE);
                }
            }catch(NumberFormatException e ){
                JOptionPane.showMessageDialog(null, "Debe de ingresar solo caracteres numericos.", "Seguro que deseas salir de la aplicación", JOptionPane.ERROR_MESSAGE);

                // Solicitud para salir del sistema
                if (JOptionPane.showConfirmDialog(null, "Universidad Latina"+NuevaLinea+"Desarrollado por: Luis Cortés Juárez."+NuevaLinea+"¿Quieres Salir del sistema?", "Salir del Sistema | Ulatina", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        }while(clave != pass );
    }
    
}
