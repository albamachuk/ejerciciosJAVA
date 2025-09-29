package com;
import java.util.Scanner;
public class Actividad6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Dime tu primera nota");
		int nota_uno = sc.nextInt();
		System.out.println("Dime segunda nota");
		int nota_dos = sc.nextInt();
		
		double media = (nota_uno + nota_dos)/2.0 ; // 2.0 para que salga decimal 
		System.out.println("Tu media es: " + media );
	}
}
