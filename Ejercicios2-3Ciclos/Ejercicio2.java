
import java.util.Scanner;
/*

2.- Realizar un programa que solicite diez números. Posteriormente debe imprimir cuantos números ubicados en el rango de 1-10 fueron introducidos,
cuantos números del 11-100 fueron introducidos y cuántos números mayores a 100 fueron introducidos. 

 */


public class Ejercicio2 {


    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num,i,acumR1 = 0, acumR2 = 0, acumR3 = 0;
        
       
        for(i=0; i<=11;i++){
            System.out.println("Escriba un numero:");
             num = console.nextInt();
            

            if (num >= 0 && num<= 10){
                acumR1++;
                
            }
            if (num >= 11 && num<= 100){
                acumR2++;
            }
            if (num > 100){
                acumR3++;
            }
            
        } 
        System.out.println("La cantidad de numeros del 1 al 10 son: "+acumR1);
        System.out.println("La cantidad de numeros del 11 a 100  son: "+acumR3);
        System.out.println("La cantidad de numeros mayores de 100 son: "+acumR2);
    }
    
}
