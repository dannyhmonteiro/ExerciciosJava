package Pacote02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
	//5. Faça um Programa que converta metros para centímetros.

	    System.out.println(" Digite o valor");

	    Scanner scan = new Scanner (System.in);
	    int valor = scan.nextInt();

	    int resultado =  (valor * 100);
	    System.out.println("resultado:" + resultado + " cm " ); 	

	}

}
