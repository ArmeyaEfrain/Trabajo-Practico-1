package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in); //entrada del numero
		int fact;
		int resultado = 1;
		System.out.println("Ingrese un numero: ");
		fact = numero.nextInt(); //guardamos el numero en fact
		System.out.println(fact);
		while (fact >=0 && fact <=10) {
			if (fact == 0) {
				resultado = resultado + 1;
				fact = resultado + 10;
			}
			else {
				resultado= resultado * fact;
						fact= fact -1;
				if(fact < 1) {
					fact = fact -2;
				}
		}
	}
		System.out.println("El factorial es: "+resultado);
}
}