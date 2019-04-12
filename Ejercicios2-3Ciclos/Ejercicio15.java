
import java.util.Scanner;

/*
15.- Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), 
saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. 
No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2 ^1 , 2^ 2 , 2^ 3 , 2^ 4 y 2^ 5 .
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Introduzca un numero como base: ");
    double a = console.nextDouble();
    
    System.out.println("Introduzca un numero como exponente: ");
    int exp = console.nextInt();
    double resultado;
    int n;
        
    for (int i = 1; i <= exp; i++) {
      resultado = 1;
      n = i;
      for (int j = 0; j < n; j++) {
        resultado*=a;
      }
         System.out.println(a+"^" +i+" = "+resultado);
    }

    }   
    
    
}
