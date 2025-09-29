package Unidad2;
import java.util.Scanner ; 
public class Actividad2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in) ; 
			int numero, numero2   ;

			System.out.println("Inserte un numero entero ");
			numero = sc.nextInt();
			System.out.println("Inserte otro numero entero ");
			numero2 = sc.nextInt() ; 
			if (numero==numero2) {
			System.out.println("El numero es es igual");
			
		} else {
			System.out.println("El numero es no es igual");
		}
			}
		}
