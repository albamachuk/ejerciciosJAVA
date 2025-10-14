
package a;
import java.util.Scanner;
public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int etiqueta = 0;
        int etiquetaMax = -1;
        int alturaMax = -1;

        while (true) {
            System.out.print("Introduce la altura del árbol " + etiqueta + " (cm) [-1 para terminar]: ");
            int altura = sc.nextInt();
            if (altura == -1) {
                break;
            }
            if (altura > alturaMax) {
                alturaMax = altura;
                etiquetaMax = etiqueta;
            }
            etiqueta++;
        }

        if (etiquetaMax != -1) {
            System.out.println("El árbol más alto es el " + etiquetaMax + " con una altura de " + alturaMax + " cm.");
        } else {
            System.out.println("No se introdujeron alturas válidas.");
        }
    }
}