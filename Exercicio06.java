package Pacote02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	
  //6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área

 		
		System.out.println("Entre com o raio de um circulo: ");
		Scanner scan = new Scanner (System.in);
		
		float raio = scan.nextInt();
		 
		float area = (float) Math.pow(Math.PI * raio,2) ; 
		
		
        System.out.println( " A area é:" + area);	

	}

}
