
import java.util.Scanner;

/*
16.- Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
Ejemplo:
Introduzca la altura de la L: 5
*
*
*
*
* * *
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        System.out.println("Introduzca la altura: ");
        int altura = console.nextInt();
        for (int i=1;i<altura;i++) {
          System.out.println("*");
        }

        for (int i=0;i<altura/2+1;i++) {
          System.out.print("* ");
        }

}

}
