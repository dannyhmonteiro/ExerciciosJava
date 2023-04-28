package Pacote02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
 //	4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		System.out.println("Digite sua nota 1");
		
		Scanner scan = new Scanner(System.in);
	    int nota1 = scan.nextInt();
	    
		System.out.println("Digite sua nota 2");
		int nota2 = scan.nextInt();
	    
		System.out.println("Digite sua nota 3");
		int nota3 = scan.nextInt();
	    
		System.out.println("Digite sua nota 4");
		int nota4 = scan.nextInt();
	    
		
		
		
		int resultado = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("a media é " + resultado);	
		
		
		
	}

}
