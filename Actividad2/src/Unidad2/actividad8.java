package Unidad2;

import java.util.Scanner;

public class actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el coeficiente a: ");
		double a = sc.nextDouble();

		System.out.print("Introduce el coeficiente b: ");
		double b = sc.nextDouble();

		System.out.print("Introduce el coeficiente c: ");
		double c = sc.nextDouble();

		if (a == 0) {
			System.out.println("No es una ecuación de segundo grado (a no puede ser 0).");
		} else {
			double discriminante = b * b - 4 + a * c;

			if (discriminante > 0) {
				double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println("Tiene dos soluciones reales:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} else if (discriminante == 0) {
				double x = -b / (2 * a);
				System.out.println("Tiene una única solución real:");
				System.out.println("x = " + x);
			} else {
				System.out.println("No existen soluciones reales (las soluciones son complejas).");
			}
		}
	}
}

