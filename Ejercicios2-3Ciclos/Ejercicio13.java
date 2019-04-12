
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

 13.-Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos números se han introducido, 
la media de los impares y el mayor de los pares. 
El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.

 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(in);
        int num = 0,i = 0, may_par = 1, j=0, k=0;
        double prom_imp = 0;
        do{
            System.out.println("Escriba un numero:");
            num = Integer.parseInt(console.readLine());
            if(num%2!=0 && num>0){
                prom_imp+=num;
                i++;
            }else if(num%2==0 && num>0){
                //System.out.println("Es par");
                if(num>may_par){
                    may_par=num;
                    j++;
                }
                }
            k++;
            
        }while(num>0);
        System.out.println("El promedio de los numeros impares fue: "+prom_imp/i);
        System.out.println("El mayor de los pares es: "+may_par);
        System.out.println("La cantidad total de numeros introducidos fueron: "+(k-1));
    }
    
}
