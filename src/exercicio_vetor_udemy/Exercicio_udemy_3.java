package exercicio_vetor_udemy;

import java.util.Scanner;

public class Exercicio_udemy_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		Aluguel[] aluguel = new Aluguel[10];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();

			System.out.println("Digite o nome do estudante ");
			String nome = sc.nextLine();
			System.out.println("Digite o email do estudante ");
			String email = sc.nextLine();
			System.out.println("Digite o numero do quarto escolhido ");
			int quarto = sc.nextInt();
			aluguel[quarto] = new Aluguel(nome, email);
		}
		
		
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(aluguel[i] != null) {
			System.out.println("Estudante " + aluguel[i].nome + " email " + aluguel[i].emal +  " quarto escolhido " + i);	
			}
		}
		sc.close();

	}

}
