
import java.util.Scanner;


public class App {


    
    public static void main(String[] args) {
 
        Scanner Console = new Scanner(System.in);
        
        int num,i,acumR1 = 0, acumR2 = 0, acumR3 = 0;
        
        for(i=0; i>=11;i++){
            
            num = Console.nextInt();
            

            if (num >= 0 && num<= 10){
                acumR1 =+ num;
                acumR1++;
                
            }
            if (num >= 11 && num<= 100){
                acumR2 =+ num;
                acumR2++;
            }
            if (num > 100){
                acumR3 =+ num;
                acumR3++;
            }
            
        } 
        System.out.println("La cantidad de numeros del 1 al 10 son: "+acumR1);
        System.out.println("La cantidad de numeros del 11 a 100  son: "+acumR3);
        System.out.println("La cantidad de numeros mayores de 100 son: "+acumR2);
    }
    
}
