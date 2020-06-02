package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		
//		8. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. 
//		Imprima a idade e a altura na ordem inversa a ordem lida.

		
		Scanner sc = new Scanner(System.in);
		
		int[] idade = new int[5];
		double[] altura = new double[5];
		int j = 0, h = 0;
		
		
			for(j = 0; j<idade.length; j++) {
				System.out.println("Digite a idade da pessoal " + (j+1));
				idade[j] = sc.nextInt();
			}	
			for(h = 0; h<altura.length; h++) {
					System.out.println("Digite a altura da pessoal " + (h+1));
					altura[h] = sc.nextDouble();
			}
		
		Imprime_vetorInverso vetor = new Imprime_vetorInverso();
		vetor.imprimeInt(idade);
		System.out.println();
		vetor.imprimeDouble(altura);
		
		sc.close();

	}

}
