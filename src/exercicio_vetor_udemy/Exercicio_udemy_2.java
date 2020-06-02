
package exercicio_vetor_udemy;

import java.util.Scanner;

public class Exercicio_udemy_2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n = sc.nextInt();
		
		Produto[] produto = new Produto[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do produto numero " +(i+1));
			String nome = sc.nextLine();
			System.out.println("Digite o valor do produto numero " +(i+1));
			double preco = sc.nextDouble();
			produto[i] = new Produto(nome,preco);
		}
		
		double soma = 0;
		
		for(int i=0; i<n; i++) {
			soma += produto[i].preco;
		}
		
		double media = soma/n;
		
		System.out.println("O preço médio dos produtos é " + media);
		
		
		
		sc.close();

	}

}
