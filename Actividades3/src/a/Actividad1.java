package a;
import java.util.Scanner;
public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
	   int num =1;    
	        while  (num != 0) {
	        	System.out.print(" Dame un numero: ");
	   	     
		       num = sc.nextInt();
	         if (num%2 ==0)  {
	        	 System.out.print("El numero es par, ");
	         }else {
	        	 System.out.print("El numero es impar, ");
	        	 
	         }
	         if (num>=0) {
	        	 System.out.print("El numero es positivo, ");
	        } else {
	        	 System.out.print("El numero es negativo, ");
	       }
	int cuadrado = num* num;
	
     	 System.out.print("El numero al cuadrado es " + cuadrado );
	
     	
	}
	 
	        System.out.print("Introduce un numero (0 para terminar" );
	        num =  sc.nextInt();
	}
}
