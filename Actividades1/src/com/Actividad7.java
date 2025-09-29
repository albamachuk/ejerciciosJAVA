package com;

import java.util.Scanner;

public class Actividad7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Dime el radio");
        int radio = sc.nextInt();
		final double PI = 3.1416;  //final es porq es una constante
		double longitud = 2 * PI * radio ;
		double area =  PI * radio * radio ;
		System.out.println("La longitud es" + longitud);
		System.out.println("La area es" + area);
	}
}
	
