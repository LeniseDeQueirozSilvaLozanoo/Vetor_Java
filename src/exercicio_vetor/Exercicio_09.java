package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
//		9. Fa�a um Programa que leia um vetor A com 10 n�meros inteiros, 
//		calcule e mostre a soma dos quadrados dos elementos do vetor.
		
		
		Scanner sc = new Scanner(System.in);


		
		int[] a = new int[10];
		int i = 0, j = 0;
		int soma = 0;
		
		
		
		for(i=0; i<a.length; i++) {
			System.out.println("Digite o " + (i+1) + "� de 10 n�meros");
			a[i] = sc.nextInt();
		}
		
		for(j=0; j<a.length; j++) {
			soma += (int) Math.pow(a[j], 2);
		
		}
		
		
		Imprime_vetor vetor = new Imprime_vetor();
		vetor.imprimeInt(a);
		System.out.println("\n" + soma);
		
	
		sc.close();
		
	}

}
