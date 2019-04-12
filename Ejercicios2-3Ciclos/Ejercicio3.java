
import java.util.Scanner;
/*
3.- Realizar un programa que solicite 10 números. 
Posteriormente debe imprimir cuantos números de los introducidos fueron pares y cuantos números fueron impares. 
*/

public class Ejercicio3 {


    public static void main(String[] args) {
        System.out.println("Introduce 10 numeros y te dire cuales son pares e impares ");
        Scanner sc = new Scanner(System.in);
        int i,num = 0, acumPar = 0, acumImp = 0;
        int arr [] = new int [10];
        int contPar = 0, contImp = 0;
        
        System.out.println("Introduce los numeros ");
        for(i = 0; i < 10; i++){
            System.out.print((i+1)+".- Digite un numero ");
            arr[i] = sc.nextInt();
            if (arr[i] % 2==0){
                contPar++;
                
            }
            else{
                contImp++;
            }
        }
        int par[] = new int[contPar];
        int impar[] = new int[contImp];
        contPar = 0;
        contImp = 0;
        
        for(i = 0; i < 10; i++){
            if(arr[i] % 2==0){
                par[contPar]= arr[i];
                contPar++;
            }
            else{
            impar[contImp] = arr[i];
            contImp++;

            }
           
        }
    
        System.out.print("Numeros pares: ");
        System.out.println("");
        for(i=0;i<contPar;i++){
            System.out.println(par[i]+"");
        }
        System.out.println("");
                System.out.print("Numeros impares: ");
        for(i=0;i<contImp;i++){
            System.out.print(impar[i]+"-");
        }
        System.out.println("");
        
    }
    
}
