/*
5.-Diseñar un programa que muestre el producto de los 10 primeros números impares. Por ejemplo 1* 3* 5* 7* 9* 11* 13* 15* 17* 19.
 */
import java.util.Scanner;

public class Ejercicio5 {


    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
         int inicial = 1 ,producto = 1;
        
         while(inicial < 10){
            if(inicial%2!=0)
            {
                producto = producto * inicial;
            }
           
            inicial++;
        }
        System.out.println("El producto de los numeros impares es: "+producto);
 

    }
    
}