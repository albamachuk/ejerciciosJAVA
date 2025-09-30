package Unidad2;
import java.util.Scanner;
public class actividad11 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una nota del 0-10");
		numero = sc.nextInt();
		
		if (numero >=9 && numero <=10){
			System.out.println("Sobresaliente");
		} else if (numero >=7 && numero<=8) {
			System.out.println("Notable");
		} else if (numero ==6) {
			System.out.println("Bien");
		}else if (numero == 5) {
			System.out.println("Suficiente");
		}else if (numero >=4 ) {
			System.out.println("Insuficiente");
		
		}
		
	}

}
