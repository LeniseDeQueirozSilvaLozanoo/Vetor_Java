package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		
//		10. Faça um Programa que leia dois vetores com 10 elementos cada. 
//		Gere um terceiro vetor de 20 elementos, cujos valores deverão ser 
//		compostos pelos elementos intercalados dos dois outros vetores.


	Scanner sc = new Scanner(System.in);
	
	int[] vetor1 = new int[10];
	int[] vetor2 = new int[10];
	int[] vetor3 = new int[10];
	int[] vetor4 = new int[30];
	int i = 0, j = 0;
	
	
	
	for(i=0; i<vetor1.length; i++) {
		System.out.println("Digite o " + (i+1) + "º elemento do vetor1");
		vetor1[i] = sc.nextInt();
	}

	for(i=0; i<vetor2.length; i++) {
		System.out.println("Digite o " + (i+1) + "º elemento do vetor2");
		vetor2[i] = sc.nextInt();
	}
	
	for(i=0; i<vetor3.length; i++) {
		System.out.println("Digite o " + (i+1) + "º elemento do vetor3");
		vetor3[i] = sc.nextInt();
	}
	
	
	for(i=0, j=0; i<vetor4.length; i+=3, j++) {
		vetor4[i] = vetor1[j];
		vetor4[i+1] = vetor2[j];
		vetor4[i+2] = vetor3[j];
	}
	
	
	
	Imprime_vetor vetor = new Imprime_vetor();
	vetor.imprimeInt(vetor1);
	System.out.println();
	vetor.imprimeInt(vetor2);
	System.out.println();
	vetor.imprimeInt(vetor3);
	System.out.println();
	vetor.imprimeInt(vetor4);
	
	sc.close();
	
	
	}

}
