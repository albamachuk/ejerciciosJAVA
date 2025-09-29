package com;
import java.util.Scanner;
public class Actividad4 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu año de nacimiento");
		int año_nac = sc.nextInt();
		System.out.println("Dime el año actual");
		int año_act = sc.nextInt();
		
		int edad = año_act - año_nac ; 
		System.out.println("Tu edad es: " + edad );
	}

}