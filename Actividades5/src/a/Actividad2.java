package a;
import java.util.Scanner;
public class Actividad2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 // pedir los números
		    System.out.print("¿cuantos números quiere introducir? ");
		    int num = sc.nextInt();
		    // hacer tabla 
		    int[] tabla = new int[num];
		    // introducir numeros
		    for (int i = 0; i < tabla.length ; i++) {
		    	System.out.println("dime un numero"  + (i + 1));
				 tabla[i] = sc.nextInt();
			    }
		    // numeros en inverso orden
		    System.out.println("numeros por inverso orden");
		    for (int i = tabla.length - 1; i >=0 ; i--) {
		    	 System.out.println("número " + (i + 1) + ": "+ tabla[i]);
		    }
	}
}

import java.util.Scanner;
import java.util.Random;

import java.util.Scanner;

public class Actividad2 {
     
    public static void main(String [] args) {
         //Solicite al usuario cuántos números desea introducir
          Scanner sc = new Scanner(System.in);
          System.out.println("Dime cuantos números: ");
          int n = sc.nextInt();
         //Crear tabla con el total de números introducidos
           int [] tabla = new int[n];
           for(int i=0; i<tabla.length;i++) {
                System.out.println("Introduzca el número: ");
                tabla[i] = sc.nextInt();
           }
           
         //Mostrar los valores de la tabla en orden INVERSO                                                                                                                                                                                                                                                                                                                                         
          for(int i = tabla.length-1; i>=0; i--) {
               System.out.println(tabla[i]);                                                                                                                                                                                                                                                                                                                                         
          }
    }                                                                                                                                                                                                                                                                                                                                          
}