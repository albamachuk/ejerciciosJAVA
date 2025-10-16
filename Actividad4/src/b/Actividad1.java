package b;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		mostrar ("prueba") ;
		mostrar(9);
		mostrar(8);
		mostrar ("prueba", 3);
	}

	public static void mostrar(String mensaje) {
		System.out.println(mensaje);

	}

	public static void mostrar(int numero) {

		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("El numero " + numero + " es impar");
		}
	}

	public static void mostrar(String mensaje, int veces) {
		while (veces > 0) {
			System.out.println(mensaje);
			veces-- ;
		}
	}
}
