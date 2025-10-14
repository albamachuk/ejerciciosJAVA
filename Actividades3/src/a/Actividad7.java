package a;
import java.util.Scanner;
public class Actividad7 {
	public static void main(String [] args) {
	int producto = 1;
		
		for (int i = 1; i <=19; i +=2) {
		
	producto *=i; 
	}
		System.out.println("EL PRODUCTO DE LOS 10 PRIMEROS NUMEROS IMPARES ES " + producto);
	}
}

