package Unidad2;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		        System.out.print("Dame un dia ");
		        int dia = sc.nextInt();

		        System.out.print("Dame un mes ");
		        int mes = sc.nextInt();

		        System.out.print("Dame el año ");
		        int año = sc.nextInt();

		        boolean fechaCorrecta = true;
		        
// || significa o esto o esto
		        if (mes < 1 || mes > 12) {
		            fechaCorrecta = false;
		        } else {
		            int diasMax = 31;

		            if (mes == 2) {
		                diasMax = 28; 
		            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
		                diasMax = 30;
		            }

		  
		            if (dia < 1 || dia > diasMax) {
		                fechaCorrecta = false;
		            }
		        }

		        
		        if (fechaCorrecta) {
		            System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + año);
		        } else {
		            System.out.println("La fecha es incorrecta.");
		        }

		    }
		}