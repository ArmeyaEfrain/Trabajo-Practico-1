package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		int multiplicacion;
		System.out.println("Ingrese un numero ;");
		numero = entrada.nextInt();
		//for (inicializacion; condicion; aumento o decremento)
		for (int i=0 ; numero>=1 && numero<=10 && i<=10 ; i++ ) {
			multiplicacion = numero * i;
			System.out.println(numero+ " x "+ i + "= " + multiplicacion );
			
		}
		
		
		
		
	}

	

}
