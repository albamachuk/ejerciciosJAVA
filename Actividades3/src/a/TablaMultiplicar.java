package a;

import java.util.Scanner;

public class TablaMultiplicar {
	public static void main(String[]args) { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número: ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			
			int calculado = i * num;
			
			System.out.println(calculado + " = " + num +  "X" + i);
		}
		
	}
}
