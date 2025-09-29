package Unidad2;
import java.util.Scanner;
public class actividad9 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Introduce un número entero entre 0 y 99999: ");
		        int numero = scanner.nextInt();

		        if (numero < 0 || numero > 99999) {
		            System.out.println("El número está fuera del rango permitido.");
		        } else {
		            int cifras = contarCifras(numero);
		            System.out.println("El número tiene " + cifras + " cifra" + (cifras > 1 ? "s." : "."));
		        }
		    }

		    public static int contarCifras(int numero) {
		        if (numero == 0) return 1;

		        int contador = 0;
		        while (numero != 0) {
		            numero /= 10;
		            contador++;
		        }
		        return contador;
		    }
		}
