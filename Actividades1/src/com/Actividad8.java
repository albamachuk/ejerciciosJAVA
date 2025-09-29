package com;
import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
     
        int edad = scanner.nextInt();
        boolean esMayorDeEdad = edad >= 18; //Calcular la edad
        
        System.out.println(esMayorDeEdad);
       
}
}