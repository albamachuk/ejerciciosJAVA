package a;
import java.util.Scanner;
public class Actividad5 {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int num1max , num2min, num;
	
		System.out.println("Dime numero maximo para el rango") ;
		System.out.println("Max:");
		num1max = sc.nextInt();
		System.out.println("Min:");
		num2min = sc.nextInt();
		
		if (num2min > num1max) {
		int aux = num1max ;
		num1max = num2min;
		num2min = aux ;
		}else if (num2min == num1max){
			System.out.println("Has introducido el mismo valor");
			
		System.out.println("Ahora introduce un valor dentro del rango");
		num = sc.nextInt();
		
	 while	 (num > num1max || num2min> num) {
			System.out.println("No está dentro del rango ");
		
	
		}
}	
	}
}