

import java.util.Scanner;

/*
 14- Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá la combinación para abrirla.
Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
    
        int pin=1726;
        int intentos = 4;
        do{
            System.out.println("Te quedan: "+intentos+" intentos");
            System.out.println("Escribe el pin para adivinar");
            int value = console.nextInt();
            if (value == pin){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            }else {
                System.out.println("Lo siento, esa no es la combinación ");
            }
            intentos--;
            if (intentos == 0){
                System.out.println("La clave era "+pin);
            }
            
        }while(intentos!=0);
    }
    }
    

