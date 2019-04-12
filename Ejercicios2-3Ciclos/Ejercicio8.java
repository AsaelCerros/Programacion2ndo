/*
8.-Pedir 5 números e indicar si alguno es múltiplo de 3.
 */
import java.util.Scanner;
/**
 *
 * @author root
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba 5 numeros ");
        int num=0,i=0;
        for(i=0;i<=4;i++){
            num = sc.nextInt();
            if(num%3==0){
                System.out.println("Este numero es multiplo de 3 = "+num);
            }
                
        }
        
        



    }
    
}
