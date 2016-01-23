/**
 * Calculadora creada en Java 23 de enero 2016 por mi
 * Era mas facil crear esto en php :-)
 */

package test;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in); // Sirve para recoger texto por consola :-)
	static int opcion = -1; //opción elegida del usuario en el momento de hacer el calculo
	static int numero1 = 0, numero2 = 0, numero3 = 0;//Variables

	public static void main(String[] args) {
         // TODO Auto-generated method stub

		//Mientras la opción elegida sea 0, preguntamos al usuario
		while(opcion != 0){
			//Try catch para evitar que el programa termine o se detenga si hay un error
			try{
				System.out.println("Hola Bienvenido, siente libre de utilizar esta calculadora\n" +
						"Ahora elige una opción:\n"+
						"1 - Sumar\n" +
						"2 - Restar\n" +
						"3 - Multiplicar\n" +
						"4 - Dividir\n" +
						"5 - Porcentaje\n" +
						"\n" +
						"Opciones Multiples\n" +
						"6 - Sumas de 3 digitos\n" +
						"7 - Restas de 3 digitos\n" +
						"0 - Salir");
				//Recoger una variable por consola
				opcion = Integer.parseInt(scanner.nextLine()); 

				//Ejecucion de operaciones
				switch(opcion){
					case 1:
						Numero();
						System.out.println(numero1+" + "+numero2+" = "+(numero1+numero2));
						break;
					case 2:
						Numero();
						System.out.println(numero1+" - "+numero2+" = "+(numero1-numero2));
						break;
					case 3:
						Numero();
						System.out.println(numero1+" * "+numero2+" = "+(numero1*numero2));
						break;
					case 4:
						Numero();
						System.out.println(numero1+" / "+numero2+" = "+(numero1/numero2));
						break;
					case 5:
						Numero();
						System.out.println(numero1+" * "+numero2+"  /  "+numero3+"  = "+(numero1*numero2/numero3));
						break;
					case 6:
						Numero();
						System.out.println(numero1+" + "+numero2+"  +  "+numero3+"  = "+(numero1+numero2+numero3));
						break;
					case 7:
						Numero();
						System.out.println(numero1+" - "+numero2+"  -  "+numero3+"  = "+(numero1-numero2-numero3));
						break;
					case 0:
						System.out.println("Hasta Luego :-)!\n" +"Creado por Luis Cortés");
						break;
					default:
						System.out.println("El número no reconocido o no es correcto.");
						break;
				}

				System.out.println("\n"); //Mostrar un salto de línea en Java

			}catch(Exception e){
				System.out.println("Uoop! Error! Por favor, comprueba los datos ingresados");
			}
		}
	}

	//Método para recoger variables por consola
	public static void Numero(){

		System.out.println("Introduce número 1:");
		numero1 = Integer.parseInt(scanner.nextLine());

		System.out.println("Introduce número 2:");
		numero2 = Integer.parseInt(scanner.nextLine());

		// Condicional para opcion multiples
		if(opcion == 5 || opcion == 6 || opcion == 7){
			System.out.println("Introduce número 3:");
			numero3 = Integer.parseInt(scanner.nextLine());
		}

		//Mostrar un salto de línea en Java
		System.out.println("\n");
	}
}
