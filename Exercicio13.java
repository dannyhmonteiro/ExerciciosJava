package Pacote02;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	
		//13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu 
		        //peso ideal, utilizando as seguintes fórmulas:
		        //a. Para homens: (72.7*h) - 58
				//b. Para mulheres: (62.1*h) - 44.7
				
				
				System.out.println(" Informe se voçê é (A) homem ou (B) mulher:  ");
				Scanner scan = new Scanner(System.in);
				String sexo = scan.nextLine();
				
				System.out.println("Informe sua altura: ");
				Scanner scan2 = new Scanner(System.in);
				
				double altura = scan2.nextDouble();
				
				double resultado = 0;
				if (sexo.equals("A") ) { 
					resultado = (double) ((72.7* altura) - 58);	
				}
				else if (sexo.equals("B") ) { 
					resultado = (double) ((62.1* altura) - 44.7);
				}
				else  {  
					System.out.println("Sexo informado inválido: ");
					return;
				}
				System.out.println("Seu peso ideal é: "  + resultado);	
		
	}

}
