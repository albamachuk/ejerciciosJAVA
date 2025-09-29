package Unidad2;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, numero2;

		System.out.println("Inserte un numero ");
		numero = sc.nextInt();
		System.out.println("Inserte otro numero distinto al primero");
		numero2 = sc.nextInt();
		if (numero > numero2) {
			System.out.println("El primer numero es mayor");

		} else if (numero < numero2) {
			System.out.println("El segundo numero es mayor");
		}
	}

}
