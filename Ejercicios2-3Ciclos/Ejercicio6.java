/*
6.-Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
la cantidad de ceros
 */

import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num=0,i=0,acumCero=0,acumPos=0,acumNeg=0, Pos = 0, Neg = 0;
        System.out.println("Escribe 10 numeros postivos y negativos ");
        for(i=0;i<=9;i++){
            System.out.println("Escribe un numero");
            num = sc.nextInt();
            if(num>0){
                acumPos+=num;
                
                Pos++;
                
            }
            if(num<0){
                acumNeg+=num;
                
                Neg++;
                
            }
            if(num==0){
            
            acumCero++;
            
        }
    }
        System.out.println("Esta es la media de positivos: "+acumPos/Pos);
        System.out.println("Esta es la media de negativos: "+acumNeg/Neg);
        System.out.println("Esta es la cantidad de ceros: "+acumCero);
    }
    
}
