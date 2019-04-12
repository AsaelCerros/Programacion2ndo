/*
7.-Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
 */
import java.util.Scanner;

public class EJercicio7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0,i=0;
        System.out.println("Dame 10 numeros ...");
        for(i=0;i<=10;i++){
           num = sc.nextInt();
           if(num<=0)
               
                System.out.println("Usted introdujo un negativo - ");
           
            
        }
        
    }
    
  }
    
