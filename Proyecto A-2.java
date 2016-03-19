package proyecto;
import javax.swing.JOptionPane;;

/**
 *
 * @author Luis
 */
public class Proyecto{

    public static void main(String[] args) {
        // variables
        int dia                     = 0;
        int semana                  = 7;
        int mes                     = 30;
        int anio                    = 365;
        int ResultadoSemanaDivision = 0;
        int ResultadoMesDivision    = 0;
        int ResultadoAnioDivision   = 0;
        //Propiedad del sistema para salto de línea:
        String NuevaLinea = System.getProperty("line.separator");

        do{
            try{
                boolean salir = false;
                do{
                    dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite los días que desea validar", "ULatina | Luis Cortés", JOptionPane.PLAIN_MESSAGE));
                    if(dia < semana ){
                        JOptionPane.showMessageDialog(null, "El número de dias ingresado es menor a la cantidad permitida, la cantidad minima es 7.", "No puedes Ingresar esa cantidad de días", JOptionPane.WARNING_MESSAGE);
                    }else{
                        ResultadoSemanaDivision = dia/semana;
                        ResultadoMesDivision    = dia/mes;
                        ResultadoAnioDivision   = dia/anio;
                        int ResultadoSemana     = (dia >= semana)? ResultadoSemanaDivision : 0 ;
                        int ResultadoMes        = (dia >= semana)? ResultadoMesDivision : 0 ;
                        int ResultadoAnio       = (dia >= semana)? ResultadoAnioDivision : 0 ;
                        JOptionPane.showMessageDialog(null,"Se obtuvo el siguiente resultado:"+NuevaLinea+"Semana: "+ResultadoSemana+ NuevaLinea + "Mes: "+ResultadoMes+ NuevaLinea + "Año: "+ResultadoAnioDivision, "Resultado de lo que solicitas", JOptionPane.PLAIN_MESSAGE);
                    }
                }while(!salir);
            }catch(NumberFormatException e ){
                JOptionPane.showMessageDialog(null, "Debe de ingresar solo caracteres numericos.", "Seguro que deseas salir de la aplicación", JOptionPane.ERROR_MESSAGE);

                // Solicitud para salir del sistema
                if (JOptionPane.showConfirmDialog(null, "Universidad Latina"+NuevaLinea+"Desarrollado por: Luis Cortés Juárez."+NuevaLinea+"¿Quieres Salir del sistema?", "Salir del Sistema | Ulatina", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        }while(dia < 7 );
    }
}
