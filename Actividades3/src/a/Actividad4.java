package a;
import java.util.Scanner;
public class Actividad4 {
	Scanner sc = new Scanner(System.in);
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
	}
}