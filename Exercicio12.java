package Pacote02;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
     //12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu 
     // peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

	System.out.println(" Informe sua altura: ");
	Scanner scan = new Scanner (System.in);
	 
	double altura = scan.nextDouble();
	double resultado = (double) ((72.7 * altura) - 58);

	System.out.println(" Seu peso ideal é: " + resultado);

	

	}

}
