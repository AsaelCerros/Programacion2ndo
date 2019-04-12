
package tarea4ciclos;

import java.util.Scanner;

public class Tarea4Ciclos {

    
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Introduce 10 numero del rango 21 en adelante ");
        
        int num,i,acumR1 = 0, acumR2 = 0,noValor = 0 ;
        
        for(i=0; i>=11;i++){
            
            num = Console.nextInt();
            

            if (num >= 21 && num<= 500){
                acumR1 =+ num;
                acumR1++;
                
            } else 
                if (num >21)
                    System.out.println("Este valor no es valido");
                noValor = + num;
                noValor++;

            if (num > 501){
                acumR2 =+ num;
                acumR2++;
            }
            
        } 
        System.out.println("La cantidad de numeros del 21 al 500 son: "+acumR1);
        System.out.println("Los valores no validos son: "+noValor);   
        System.out.println("La cantidad de numeros mayores de 501 son: "+acumR2);
    }
    
}
