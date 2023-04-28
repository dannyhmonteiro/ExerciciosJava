package Pacote02;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
//		15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas 
//		no mês. 
		//Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 
//		11% para o Imposto de Renda,
		//8% para o INSS e
		//5% para o sindicato, faça um programa que nos 
//		dê:
//		a. salário bruto.
//		b. quanto pagou ao INSS.
//		c. quanto pagou ao sindicato.
//		d. o salário líquido.
//		e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
//		f. + Salário Bruto : R$
//		g. - IR (11%) : R$
//		h. - INSS (8%) : R$
//		i. - Sindicato ( 5%) : R$
//		= Salário Liquido : R$
//		Obs.: Salário Bruto - Descontos = Salário Líquido.	
		
		System.out.println("Informe o valor que voçê ganha por hora:  ");
		Scanner scan = new Scanner (System.in);
		Double valor = scan.nextDouble();
		
		System.out.println("Informe quantas horas trabalha por dia:  ");
		Scanner scan1 = new Scanner (System.in);
		Double horas = scan.nextDouble();
		
		System.out.println("Informe quantos dias trabalha no mês:  ");
		Scanner scan2 = new Scanner (System.in);
		Double dias = scan.nextDouble();
		
		Double salarioBruto = valor * horas * dias;
	    System.out.println("O total de seu salário é: " + salarioBruto);
	   
	    double imposto = salarioBruto * 0.11;
	    double inss = salarioBruto * 0.08;
	    double sindicato = salarioBruto * 0.05;
	    
	    
	    Double salarioLiquido = salarioBruto -  (imposto) -  (inss) - (sindicato) ;
	    System.out.println("Seu salário líquido será; " + salarioLiquido ); 
	    
	    
		
		
	}

}
