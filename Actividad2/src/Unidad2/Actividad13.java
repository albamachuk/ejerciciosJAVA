package Unidad2;
import java.util.Scanner;
public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 System.out.print("Dame la hora ");
	        int hora = sc.nextInt();

	        System.out.print("Dame los minutos ");
	        int minutos = sc.nextInt();

	        System.out.print("Dame los segundos ");
	        int segundos = sc.nextInt();

	        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
                System.out.println("Hora no válida.");
            } else {
           // ++ (es mas 1)
                segundos++;
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                    if (minutos == 60) {
                        minutos = 0;
                        hora++;
                        if (hora == 24) {
                            hora = 0;
                        }
                    }
                }

              
                System.out.printf("Hora actual +1 segundo: ", hora, minutos, segundos);
            }
	}
}