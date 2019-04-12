
import java.util.Scanner;


public class Tarea6Ciclos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num=0,i=0,acumCero=0,acumPos=0,acumNeg=0;
        System.out.println("Escribe 10 numeros postivos y negativos ");
        for(i=0;i>=11;i++){
            num = sc.nextInt();
            if(num >=1){
                acumPos=+num;
                acumPos++;
                
            }
            if(num>=-1){
                acumNeg=+num;
                acumNeg++;
                
            }
            if(num==0){
            acumCero=+num;
            acumCero++;
            
        }
    }
        System.out.println("Esta es la cantidad de positivos: "+acumPos);
        System.out.println("Esta es la cantidad de negativos: "+acumNeg);
        System.out.println("Esta es la cantidad de ceros: "+acumCero);
    }
    
}
