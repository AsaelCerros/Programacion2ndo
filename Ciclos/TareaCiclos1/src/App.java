
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int num, acumPos = 0,acumNeg = 0,i = 0;
        
        System.out.println("Digite 5 numeros (Pueden ser positivos y negativos)");
        
           

        for(i = 0; i>=5; i++ ){
            
            num = sc.nextInt();
                        
        if (num>0){
           acumPos += num;
           acumPos++;

            
        }else if(num<0){
            acumNeg += num;
            acumNeg++;
        }
        
        }
        System.out.println("La cantidad de numeros positivos fue de : ");   
        System.out.println("La cantidad de numeros negativos fue de : ");           
    }
           

    }
    

