Proceso PintarLaCasa
	Escribir "Jugando a pintar una casa";
	Escribir "";
	Escribir "Hola, Luis";
	Escribir "¿Que quieres hacer hoy?";
	Escribir "1)Ir a Trabajar (Hoy toca pintar una casa)";
	Escribir "2)Seguir durmiendo";
	
	leer a;
	Si a = 1 entonces
		c <- "";
		hacer
		Escribir "¿Los materiales ya estan comprados? (¿si / no?)";
		Leer c;
		Hasta Que c == "si" O c == "no";
		escribir "Los materiales ya estan comprados";
		escribir "¿El contratante ya llego con la pintura? (¿si / no?)";
		Leer d;
		
		Mientras d = "no" Hacer
			escribir "El pintor y su ayudante estan descansan";
		Fin Mientras
		
		escribir "¿empezar a trabajar?"
		leer g;
		
		si g = "si" entonces
			escribir "La pintura esta a punto de agotarse (¿si / no?)";
			leer f;
			si f = "si" entonces
				escribir "informar al contratante";
			sino
				escribir "seguir pintando";
				escribir "¿La pintura ya seco?"
				leer i;
				Si i="no" entonces
					Escribir "Mientras se seca la pintura ¿quieres almorzar?";
					leer j;
					si j = "si" entonces
						escribir "almorzar";
						Escribir "¿ya termino de almorzar?";
						leer k;
						si k = "si" entonces
							escribir "Revisar si la pintura esta seca";
							escribir "¿La pintura ya seco?";
							leer l;
							si l = "si" entonces
								escribir "Seguir pintando la casa";
								escribir "¿Termino de pintar la casa?";
								leer m;
								si m = "si" entonces
									escribir "¿Ya seco la pintura?";
									leer n;
									si n = "si" entonces
										escribir "enseñar al dueño el trabajo terminado";
										escribir "¿Recibir el pago?";
										leer p;
										
										si p = "si" entonces
											escribir "CLARO QUE SI!!";
										sino
											escribir "ESTO ES UN ERROR CLARO QUE SI QUIERO QUE ME PAGUEN!!!";
										FinSi
									sino
										escribir "esperar a que termine de secar la pintura";
									FinSi
								sino
									escribir "no";
								FinSi
							sino
								escribir "esperar a que la pintura seque";
							FinSi
						Sino
						FinSi
					Sino
						Escribir "esperar a tener hambre";
					FinSi
				Sino
					
				Fin Si
			Fin Si
		Fin Si
	Sino
		Escribir "Eres un vago";
		Escribir "¿No quieres trabajar? (¿si / no?)";
		leer b;
		Si b = "si" Entonces
			Escribir "Ya es tarde estas despedido";
		Sino
			Si b = "no" Entonces
				Escribir "Eres un vago";
			Sino
				Escribir "Eres un vago";
			Fin Si
		Fin Si
	Fin Si
FinProceso
