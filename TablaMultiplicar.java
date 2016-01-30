public class TablaMultiplicar {

	public static void main(String[] args) {
		int Tabla = 20;
		int multiplicador = 10;
	    System.out.println( "Tablas de Multiplicacion \n");
		for(int numero = 1; numero <= Tabla; numero++){

		    System.out.println( "--- Tabla del "+numero+" ---\n");
		    for(int multiplicado = 1; multiplicado <= multiplicador; multiplicado++){
		    	System.out.println(numero +" * "+ multiplicado +" = "+ (numero * multiplicado) +"\n");
		    }
		}
	}
}
