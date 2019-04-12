/*
9.-Realice un programa programa que imprime una serie de numeros pares  especificando que x comienza con un valor de 2, 
y que tendrá incrementos de 2 en 2 mientras sea menor a 20, el resultado sera la impresión de valores del 2 al 18(solo números pares).
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        do{
            System.out.println(i+=2);
        }while(i<18);
    }
    
    
}

