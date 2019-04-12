
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 11.-Dibuja un cuadrado de n elementos de lado utilizando *. ejemplo cuando la n =2 deberá imprimir
**   y si es n = 3 debera imprimir           ***
**                                           ***
                                             *** 
 */
public class EJercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(in);
        System.out.println("De que tamano desea el cubo: ");
        int n = Integer.parseInt(console.readLine());
        int i=0 , j=0;
        do {
            do{
                System.out.print("*");
                j++;
            }while(j<n);
            System.out.println("");
            i++;
            j=0;
        }while(i<n);
    }
    
}
