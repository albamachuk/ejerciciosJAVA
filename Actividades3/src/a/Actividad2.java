package a;
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int edad, alumn, mediaEdad, mayorEdad, sumaEdad; 
	alumn = 0;
			mayorEdad = 0;
			mediaEdad =0;
			sumaEdad = 0;
			
			do {
			System.out.println("¿Que edad tiene el alumno?");
			edad = sc.nextInt();
			if(edad >0) {
				alumn++;
				sumaEdad = sumaEdad + edad;
				mediaEdad = sumaEdad / alumn;
			}
			if (edad >18) {
				mayorEdad++;
			}
			} while	 (edad >=18) {
				System.out.println("la suma de edades es: " + );
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
				
	}	
}
}