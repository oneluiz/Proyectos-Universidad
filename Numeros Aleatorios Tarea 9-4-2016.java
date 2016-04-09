import java.util.Random;

public class Tarea {
 
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Random NumeroAleatorio = new Random();
    int numero[] = new int[201];
    
    for(int numeros = 1; numeros <= 6000; numeros++){
      ++numero[NumeroAleatorio.nextInt(200)];
    }
    
    System.out.println("Numero - Aleatorio");
    for(int i = 1; i < numero.length; i++){
      System.out.println(i +"    -   "+ numero[i]*3);
    }
  }
}
