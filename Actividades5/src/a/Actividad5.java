package a;
import java.util.Scanner;
import java.util.Random;

public class Actividad5 {
	 public static void main(String [] args) {
	 Scanner sc = new Scanner(System.in);   
	    Random rand = new Random();
	    
	    System.out.print("elige la longitud de la combinación: ");
        int longitud = sc.nextInt();
      
        int[] combinacion = new int[longitud];
        for (int i = 0; i < longitud; i++) {
        	 combinacion[i] = rand.nextInt(5) + 1; 
        }
        	 int fallos;

          
             do {
                 fallos = 0;
                 System.out.println("introduce tu intento:");
                 
                 for (int i = 0; i < longitud; i++) {
                     System.out.print("numero " + (i + 1) + ": ");
                     int intento = sc.nextInt();
                     
                     if (intento < combinacion[i]) {
                         System.out.println("el numero secreto es mayor");
                         fallos++;
                         
                     }else if (intento>combinacion[i]) {
                    	 System.out.println("el numero secreto es menor");
                    	 fallos++;
                     }else {
                    	 System.out.println("correcto en esta posición");
                     }
                 }
                 
                 if (fallos > 0) {
                     System.out.println("has fallado en " + fallos + " posiciones. Intenta de nuevo");
                 }
             
	   } while (fallos != 0);

       // 5. Final del juego
       System.out.println("has abierto la cámara secreta");
       
   }
}

	