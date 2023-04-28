package Pacote02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		//11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
				//	a. o produto do dobro do primeiro com metade do segundo .
				//b. a soma do triplo do primeiro com o terceiro.
				//c. o terceiro elevado ao cubo.

				
				System.out.println(" Informe um numero inteiro1 ");
				
				Scanner scan = new Scanner(System.in);
				int inteiro1 = scan.nextInt();
				
				
				System.out.println(" Informe um numero inteiro2 ");
				
		        Scanner scan1 = new Scanner(System.in);
				int inteiro2 = scan.nextInt();
				
				
				System.out.println(" Informe um numeroReal");
				
				Scanner scan2 = new Scanner(System.in);
				double numeroReal = scan.nextDouble();
				
				double a = (inteiro1 * 2) * (inteiro2 / 2);
		     	double b = (inteiro1 * 3) + numeroReal;
		     	double c = Math.pow(numeroReal, 3);
		     	
		     	System.out.println("O valor de a é: " + a );
		     	System.out.println("O valor de b é: " + b );
		     	System.out.println("O valor de c é: " + c );
		     
									

	}

}
