package Unidad2;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserte un numero decimal:");
		double numero = sc.nextDouble();

		if (numero > -1 && numero < 1 && numero != 0) {
			System.out.println(numero + "es un numero casi-numero");

		} else {
			System.out.println(numero + "NO es un numero casi-cero");
		}
	}

}
