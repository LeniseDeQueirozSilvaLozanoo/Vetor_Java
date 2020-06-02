package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
	
//		6. Faça um Programa que peça as 4 notas de 10 alunos, calcule e armazene num vetor a média de cada aluno,
//		imprima o número de alunos com média maior ou igual a 7.0.
		
		Scanner sc = new Scanner(System.in);
		
		Imprime_vetor vetor = new Imprime_vetor();
		
		double[] media = new double[3];
		

		int i, m = 0;
	
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		
		
		for(i=0; i<media.length; i++) {
		
		System.out.println("Digite a primeira nota do aluno: " + (i+1));
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno: " + (i+1));
		nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno: " + (i+1));
		nota3 = sc.nextDouble();
		System.out.println("Digite a quarta nota do aluno: " + (i+1));
		nota4 = sc.nextDouble();
		System.out.println("-------------------------------");

		media[i] = (nota1 + nota2 + nota3 + nota4) / 4; 
	
		}
				
		for(m=0; m<media.length; m++) {
			
			if(media[m] >= 7.0) {
				System.out.println(media[m] + " ");
			}
		}
		
		



		
		
		sc.close();
		
		
		
	}

}
