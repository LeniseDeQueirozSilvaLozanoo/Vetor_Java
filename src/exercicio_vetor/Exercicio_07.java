package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
//		7. Fa�a um Programa que leia um vetor de 5 n�meros inteiros, mostre a soma, a multiplica��o e os n�meros.


		Scanner sc = new Scanner(System.in);
		Imprime_vetor vetor = new Imprime_vetor();
		
		
		int[] numeros = new int[5];
		int n, i, soma = 0, mult = 1;
		
		for(i=0; i<numeros.length; i++) {
			System.out.println("Digite o " + (i+1) + "� n�mero");
			numeros[i] = sc.nextInt();
			soma += numeros[i];
			mult *= numeros[i];
		}
		

		
		vetor.imprimeInt(numeros);
		
		System.out.println("\nSoma: " + soma + "\nMultiplica��o " + mult);
		
		sc.close();
		
		
	}

}
