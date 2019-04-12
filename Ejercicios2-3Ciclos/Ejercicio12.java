
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 12.-Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. 
A priori, el programa no sabe cuántos números se introducirán. 
El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(in);
        int num = 0,i = 0;
        double prom = 0;
        do{
            System.out.println("Escriba un numero:");
            num = Integer.parseInt(console.readLine());
            if(num>0){
                prom+=num;
                i++;
            }
            
        }while(num>0);
        System.out.println("El promedio de los numeros fue: "+prom/i);
    }
    
}
