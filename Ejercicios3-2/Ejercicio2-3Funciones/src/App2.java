
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class App2 {

    /**
     * @param args the command line arguments
     */
    
    public static void triangulo(){
        Scanner console = new Scanner(System.in);
        System.out.println("Introduzca el valor del lado 1");
        int lado1 = console.nextInt();
        System.out.println("Introduzca el valor del lado 2");
        int lado2 = console.nextInt();
        System.out.println("Introduzca el valor del lado 3");
        int lado3 = console.nextInt();
        if(lado1>0 && lado2>0 && lado3>0){
            if(lado1+lado2>lado3 && lado1+lado3>lado2 && lado2+lado3>lado1){
                double p = (lado1+lado2+lado3)/2;
                double resultado = (p*(p-lado1)*(p-lado2)*(p-lado3));
                double area = Math.sqrt(resultado);
                System.out.println("El area del triangulo es: "+area);
            }else{
                System.out.println("Introduzca valores validos");
            }
            
        }else{
            System.out.println("Introduzca valores positivos, Por favor.");
        }
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        triangulo();
    }
    
}
