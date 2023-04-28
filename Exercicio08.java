package Pacote02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		//8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas 
		//no mês. Calcule e mostre o total do seu salário no referido mês
	  
		System.out.println("Informe qual valor voçê ganha por hora ? ");
		Scanner scan = new Scanner (System.in);
		double valor = scan.nextDouble();
		
		
		System.out.println("Informe quantas horas trabalha por dia ? ");
		Scanner scan1 = new Scanner (System.in);
		double hora = scan1.nextDouble();
		
		
		System.out.println("Informe quantos dias trabalha por mes ? ");
		Scanner scan2 = new Scanner (System.in);
		double dias = scan1.nextDouble();
		
		
		
		double resultado = valor * hora * dias;
		System.out.println(" O seu sálario será " + resultado);	
		
	}

}
