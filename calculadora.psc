Proceso Canculadora

// Menu de la Calculadora
Escribir "¿Que operacion quieres hacer?";
Escribir "1. suma";
Escribir "2. Resta";
Escribir "3. Multiplicacion";
Escribir "4. Division";
Escribir "5. Porcetanje";
leer a

// Suma
Si a = 1 Entonces
	Escribir "Digite un valor";
	leer suma1;
	Escribir "Digite otro valor";
	leer suma2;
	SumaTotal<- sumar1+sumar2;
	Escribir "La suma de ",suma1, "+", suma2," es igual a:", SumaTotal;
	Escribir "Toque para finaliza la ejecución...";
	Esperar Tecla;
Sino
	// Resta
	Si a = 2 Entonces
		Escribir "Digite un valor";
		leer Resta1;
		Escribir "Digite otro valor";
		leer Resta2;
		RestaTotal<- Resta1-Resta2;
		Escribir "La Resta de ",Resta1, "+", Resta2," es igual a:", RestaTotal;
		Escribir "Toque para finaliza la ejecución...";
		Esperar Tecla;
	Sino
		// Multiplicacion
		Si a = 3 Entonces
			Escribir "Digite un valor";
			leer Multiplicacion1;
			Escribir "Digite otro valor";
			leer Multiplicacion2;
			MultiplicacionTotal<- Multiplicacion1*Multiplicacion2;
			Escribir "La Multiplicacion de ",Multiplicacion1, "*", Multiplicacion2," es igual a:", MultiplicacionTotal;
			Escribir "Toque para finaliza la ejecución...";
			Esperar Tecla;
		Sino
			// Division
			Si a = 4 Entonces
				Escribir "Digite un valor";
				leer Division1;
				Escribir "Digite otro valor";
				leer Division2;
				DivisionTotal<- Division1/Division2;
				Escribir "La Division de ",Division1, "/", Division2," es igual a:", DivisionTotal;
				Escribir "Toque para finaliza la ejecución...";
				Esperar Tecla;
			Sino
				// Porcentaje
				Si a = 5 Entonces
					Escribir "Digite el valor del cual desea obtener porcentaje";
					leer Porcentaje1;
					Escribir "Digite el porcentaje que desea obtener";
					leer Porcentaje2;
					PorcentajeTotal<- Porcentaje1*Porcentaje2/100;
					Escribir "El ",Porcentaje2, "% de ", porcentaje1," es igual a:", PorcentajeTotal;
					Escribir "Toque para finaliza la ejecución...";
					Esperar Tecla;
				Sino
					Escribir "No ingresaste una opcion validad, por favor intentalo de nuevo";
					Esperar Tecla;
				Fin Si
			Fin Si
		Fin Si
	Fin Si
Fin Si
FinProceso

