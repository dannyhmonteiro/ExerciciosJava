package Pacote02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
	//7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área 
	//para o usuário.
				
				
				
				System.out.println("Digite a medida do lado do quadrado ");
				
				Scanner scan = new Scanner (System.in);
				double lado = scan.nextInt();
				
				double area = Math.pow(lado, 2);
				double resultado = area * 2; 
				
				System.out.println("O dobro da area é: " + resultado);	
		
	}

}
