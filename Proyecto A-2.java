package proyecto;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Proyecto {

    public static void main(String[] args) {
        // variables
        String dia          = "";
        int DiaInt          = 1;
        int semana          = 7;
        int mes             = 30;
        int anio            = 365;
        int ResultadoSemanaDivision = 0;
        int ResultadoMesDivision    = 0;
        int ResultadoAnioDivision   = 0;
        //Propiedad del sistema para salto de línea:
        String NuevaLinea = System.getProperty("line.separator");
        
        do{
            try{
                dia = JOptionPane.showInputDialog("Digite los días que desea validar", null);
                DiaInt = StringAentero(dia);
                if(DiaInt < semana ){
                    JOptionPane.showMessageDialog(null, "El número de dias ingresado es menor a la cantidad permitida, la cantidad minima es 7.", "No puedes Ingresar esa cantidad de días", JOptionPane.WARNING_MESSAGE);
                }else{
                    ResultadoSemanaDivision = DiaInt/semana;
                    ResultadoMesDivision    = DiaInt/mes;
                    ResultadoAnioDivision   = DiaInt/anio;
                    int ResultadoSemana     = (DiaInt >= semana)? ResultadoSemanaDivision : 0 ;
                    int ResultadoMes        = (DiaInt >= semana)? ResultadoMesDivision : 0 ;
                    int ResultadoAnio       = (DiaInt >= semana)? ResultadoAnioDivision : 0 ;
                    JOptionPane.showMessageDialog(null,"Se obtuvo el siguiente resultado:"+NuevaLinea+"Semana: "+ResultadoSemana+ NuevaLinea + "Mes: "+ResultadoMes+ NuevaLinea + "Año: "+ResultadoAnioDivision, "Resultado de lo que solicitas", JOptionPane.PLAIN_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "El número de dias ingresado es menor a la cantidad permitida, la cantidad minima es 7.", "Seguro que deseas salir de la aplicación", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }while(DiaInt < 7 );
    }

    public static int StringAentero( String str ){
        int i = 0;
        int num = 0;
        boolean EsNegativo = false;

        //Compruebe si hay signo negativo; si está allí, establecer el indicador isNeg
        if (str.charAt(0) == '-') {
            EsNegativo = true;
            i = 1;
        }

        //Procesar cada carácter de la cadena;
        while( i < str.length()) {
            num *= 10;
            num += str.charAt(i++) - '0';
        }

        if (EsNegativo)
            num = -num;
        return num;
    }
}
