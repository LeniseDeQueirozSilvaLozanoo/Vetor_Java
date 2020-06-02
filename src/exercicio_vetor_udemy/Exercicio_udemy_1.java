package exercicio_vetor_udemy;

import java.util.Scanner;

public class Exercicio_udemy_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		
		int numDigitado = sc.nextInt();
		
		double[] altura = new double[numDigitado];
		
		for( int i=0; i< numDigitado; i++) {
			System.out.println("Digite a " + (i+1) + "ª altura");
			
			altura[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for (int i=0; i<numDigitado; i++) {
			soma += altura[i];
		}
		
		double media = soma/numDigitado;
		
		System.out.println("A média das alturas é " + soma);
		
		sc.close();

	}

}
