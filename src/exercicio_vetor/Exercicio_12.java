package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		
//		12. Foram anotadas as idades e alturas de 30 alunos. 
//		Fa�a um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior � m�dia de altura desses alunos.
		
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		double altura = 0;
		int i = 0, cont = 0;
		double media = 0;
		Exercicio_12Alunos[] vetorAlunos = new Exercicio_12Alunos[10];
	
		for(i=0; i<vetorAlunos.length; i++) {
			System.out.println("Digite a idade do aluno " + (i+1));
			idade = sc.nextInt();
			System.out.println("Digite a altura do aluno " + (i+1));
			altura = sc.nextDouble();
			vetorAlunos[i] = new Exercicio_12Alunos(idade,altura);
		}
		
//		12. Foram anotadas as idades e alturas de 30 alunos. 
//		Fa�a um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior � m�dia de altura desses alunos.

		
		for(i = 0; i<vetorAlunos.length; i++) {
			media += vetorAlunos[i].altura/10;
		}
		
		for(i = 0; i<vetorAlunos.length; i++) {
			if(vetorAlunos[i].idade < 13 & vetorAlunos[i].altura < media) {
				cont += 1;
			}
		}
		
		
		
		for(i = 0; i<vetorAlunos.length; i++) {
						
		System.out.println("Idade do aluno " + (i+1) + ": " + vetorAlunos[i].idade + " e sua altura: " + vetorAlunos[i].altura +  "\n");
		}
		System.out.printf("A m�dia das alturas �: %.2f%n" , media);
		System.out.println("A quantidade de alunos com menos de 13 anos e altura inferior a m�dia �: " + cont);
		
		
		
		sc.close();

	}

}
