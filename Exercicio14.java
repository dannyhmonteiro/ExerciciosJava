package Pacote02;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		//14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o 
//		rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
//		estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma 
//		multa de R$ 4,00 por quilo excedente. 
		//1 João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
		//	2 Gravar na variável excesso a quantidade de quilos além do limite e 
		//	3 na variável multa o valor da multa que João deverá pagar.
		//	4 Imprima os dados do programa com as mensagens adequadas.
			
			System.out.println("Informe o peso dos peixes: ");
			Scanner scan = new Scanner (System.in);
			double peso = scan.nextDouble();
			double limite = 50;
			 

			if (peso <= limite) {
				System.out.println("O peso esta correto!");
			}
			if (peso > limite) {
				double excedente = peso - 50;
				double multa = excedente * 4;
				System.out.println("O valor a excedente será: R$" + multa);
			}	
		
		
		
		
	}

}
