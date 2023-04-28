package Pacote02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//3. Faça um Programa que peça dois números e imprima a soma.  //
		
		 System.out.println("Escreva numero1");
			
		 Scanner scan = new Scanner(System.in);
		 int numero1 = scan.nextInt();
		    
		    
		 System.out.println("Escreva numero2");
		 int numero2 = scan.nextInt();
		    
		 
		 int resultado = ( numero1 + numero2 );
		 System.out.println( " O resultado é " + resultado  );
		    	

	}

}
