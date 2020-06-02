package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_01A {

	public static void main(String[] args) {
		
		// 1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.  
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[5];
		int i = 0;
		for(i=0; i<numeros.length; i++) {
			System.out.println("Digite o " + (i+1) +  "º numero: ");
			numeros[i] = sc.nextInt();
		}
		
		for(i=0; i<numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		

		sc.close();
	}

}