package Unidad2;
import java.util.Scanner;
public class actividad1010 {
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.print("Introduce un número de (2-4 cifras)");
      int numero = scanner.nextInt();
      
      System.out.print("el numero es menor que 10?");
      boolean esMayorDe10 = numero < 10; 
      if (numero <10){
			System.out.println("No es capua (solo una cifra)");
		} else {
			 System.out.print("el numero es menor que 1000?");
		      boolean esMayorDe1000 = numero < 1000; 		      

			if (numero < 1000) {
				unidades = numero % 10
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
