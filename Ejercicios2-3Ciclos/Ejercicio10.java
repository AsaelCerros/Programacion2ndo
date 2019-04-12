/*
10.-Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
 */
import java.util.Scanner;

public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Alumnos_alt = 0, i, Alumnos_may = 0;
        double estatura, est_prom = 0, edad_prom = 0, edad=0;
        Scanner console = new Scanner(System.in);
        for(i=1;i<=5;i++){
            System.out.println("Escriba su edad "+i);
            edad = console.nextInt();
            edad_prom+=edad;
            if(edad>=18){
                Alumnos_may++;
            }
            System.out.println("Escriba su estatura "+i);
            estatura = console.nextDouble();
            est_prom+=estatura;
            if(estatura>=1.75){
                Alumnos_alt++;
            }
           
        }
        System.out.println("Promedio de edad "+edad_prom/5);
        System.out.println("Promedio de estatura "+est_prom/5);
        System.out.println("Cantidad de alumnos mayores de edad: "+Alumnos_may);
        System.out.println("Cantidad de alumnos mayores a 1.75 "+Alumnos_alt);
    }
    
}
