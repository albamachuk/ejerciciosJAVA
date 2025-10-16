

package a;
import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean haySuspenso = false;

        for (int i = 1; i <= 5; i++) { // for= hasta donde queremos llegar 
            System.out.print("Introduce la calificación del alumno " + i + ": ");
            double nota = sc.nextDouble();
            if (nota < 5) {
                haySuspenso = true;
            }
        }

        if (haySuspenso) {
            System.out.println("Hay al menos un suspenso.");
        } else {
            System.out.println("No hay ningún suspenso.");
 }
  }
}
