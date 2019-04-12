
package tarea5ciclos;

import java.util.Scanner;

public class Tarea5Ciclos {


    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = 0,i = 0,acumPar =0,acumImp =0;
        for(i=0;i<10;i++){
            num = sc.nextInt();
            if (num % 2==0){
                acumPar++;
                
            }
            else{
                acumImp++;
            }
            
            System.out.println("El total de numeros pares es: "+acumPar);
            System.out.println("El total de numeros impares es: "+acumImp);
        }
 

    }
    
}
