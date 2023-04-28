package Pacote02;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
//		16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros 
//		quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros 
//		quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário 
//		a quantidades de latas de tinta a serem compradas e o preço total

		  // 1 litro = 3 metros
	    // cada lata de tinta possui 18 litros
	    // que custam 80 reais
		
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Informe o tamanho da área em metros quadrados: ");
	    double area = input.nextDouble();
	    
	    // Calcula a quantidade de litros de tinta necessária
	    double litrosTinta = area / 3.0;
	    double numeroLatas = litrosTinta / 18;
	    numeroLatas = Math.ceil(numeroLatas);
	    
	    double custoTotal = numeroLatas * 80;
	    
	    // usa a variavel litrosTinta para dividir por 18(quantidade de uma lata) - assim voce recebe o numero de latas necessario
	    // o valor anterior precisa ser arredondado para cima, para ter numero inteiro Math.ceil(valor)
	    // para pegar o valor total de custo , ai pegaria o numero de latas e multiplicaria por 80
	    
	    System.out.println(" Será necessário: "+ numeroLatas + " latas de tintas e o valor total será " + custoTotal );	
		

	}

}
