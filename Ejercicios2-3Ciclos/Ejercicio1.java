
import java.util.Scanner;
/*
1.- Realizar un programa que solicite cinco números. 
Posteriormente debe imprimir cuantos números de los introducidos fueron positivos y cuantos números fueron negativos. 
*/

public class Ejercicio1 {


    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int num, acumPos = 0,acumNeg = 0,i = 0;
        
        System.out.println("Digite 5 numeros (Pueden ser positivos y negativos)");
        
           

        for(i = 0; i<=4; i++ ){
            
            num = sc.nextInt();
                        
        if (num>0){
           acumPos++;

            
        }else if(num<0){
            acumNeg++;
        }
        
        }
        System.out.println("La cantidad de numeros positivos fue de : "+acumPos);   
        System.out.println("La cantidad de numeros negativos fue de : "+acumNeg);           
    }
           

    }
    

