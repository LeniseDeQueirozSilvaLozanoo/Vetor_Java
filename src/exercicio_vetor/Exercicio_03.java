package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		//Fa�a um Programa que leia 4 notas, mostre as notas e a m�dia na tela.

		Scanner sc = new Scanner(System.in);
		
		double[] nota = new double[4];
		int i = 0;
		double soma = 0;
		for(i=0; i<nota.length; i++) {
			System.out.println("Digite a " + (i+1) + "� nota de 4");
			nota[i] = sc.nextDouble();
		}
		
		for(i=0; i<nota.length; i++) { 
			soma =+ nota[i];
			}
		
		double media = soma/4;
		
		
		Imprime_vetor v = new Imprime_vetor();
		v.imprimeDouble(nota);
		System.out.println("A m�dia da notas �: " + media);
		
		sc.close();


	}

}
