package a;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		//Creo la tabla
		double[]numeros = new double[5];
		Scanner sc =  new Scanner(System.in);
		
		//Recorro la tabla para guardar los números del usuario
		for (int i = 0; i < 5; i++) {
			//Pedir uno a uno los números y guardarlos	
		System.out.println("dime un numero"  + (i + 1));
		 numeros[i] = sc.nextDouble();
		}
		System.out.println("los números introducidos son");
		//Recorrer la tabla para mostrar los números 
		for (int i = 0; i < 5; i++) {
			 System.out.println("número " + (i + 1) + ": "+ numeros[i]);
		}		
	}
}
