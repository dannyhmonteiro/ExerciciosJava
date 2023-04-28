package Pacote02;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
	
//		18. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros 
//		quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros 
//		quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 
//		litros, que custam R$ 25,00.
//		o Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços 
//		em 3 situações:
//		o comprar apenas latas de 18 litros;
//		o comprar apenas galões de 3,6 litros
//	
		System.out.println("Informe o tamanho em metros a ser pintado: ");
		Scanner input = new Scanner(System.in);
		double area = input.nextDouble();
		
		double litrosTinta = area / 6.0;
		double numeroLatas = litrosTinta / 18;
		double numeroGaloes = litrosTinta / 3.6;
		numeroLatas = Math.ceil(numeroLatas);
	
		double custoTotal = numeroLatas * 80;
		double valorTotalGalao = numeroGaloes *25;
		
		System.out.println(" Será necessário: "+ numeroLatas + " latas de tintas e o valor total será " + custoTotal );
		System.out.println(" Será necessário: "+  numeroGaloes + " galões de tintas e o valor total será " + valorTotalGalao );
		
		

	}

}
