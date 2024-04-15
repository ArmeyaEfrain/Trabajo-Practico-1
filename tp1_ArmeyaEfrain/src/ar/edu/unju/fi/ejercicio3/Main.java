package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //para ingresar los datos 
		int numero;
		int triple;
		int doble;
		System.out.println("Ingrese un numero : ");
		numero = entrada.nextInt(); //guardamos el numero ingresado en "numero"
		System.out.println("El numero ingresado es: "+ numero);
		if(numero % 2 == 0) { //para saber si es par 
		   triple = numero * 3;
		   System.out.println("El numero es par");
		   System.out.println(triple);
	}
		else {
			doble = numero * 2;
			System.out.println("El numero es impar");
		System.out.println(doble);
		}
}
}