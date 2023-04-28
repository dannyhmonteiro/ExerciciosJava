package Pacote02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		// 10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus 
				//Fahrenheit.

				System.out.println(" Informe a temperatura em graus Celsius: ");
				Scanner scan = new Scanner(System.in);
				
		        double Celsius = scan.nextDouble();
				
				double resultado = (Celsius * 1.8) + 32 ;
				
				System.out.print("A temperatuda em graus Fahrenheit é: " + resultado);	
		
	}

}
