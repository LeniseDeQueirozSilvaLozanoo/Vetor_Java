package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
//		10. Fa�a um Programa que leia dois vetores com 10 elementos cada. 
//		Gere um terceiro vetor de 20 elementos, cujos valores dever�o ser 
//		compostos pelos elementos intercalados dos dois outros vetores.


	Scanner sc = new Scanner(System.in);
	
	int[] vetor1 = new int[10];
	int[] vetor2 = new int[10];
	int[] vetor3 = new int[20];
	int i = 0, j = 0;
	
	
	
	for(i=0; i<vetor1.length; i++) {
		System.out.println("Digite o " + (i+1) + "� elemento do vetor1");
		vetor1[i] = sc.nextInt();
	}

	for(i=0; i<vetor2.length; i++) {
		System.out.println("Digite o " + (i+1) + "� elemento do vetor2");
		vetor2[i] = sc.nextInt();
	}
	
	
	for(i=0, j=0; i<vetor3.length; i+=2, j++) {
		vetor3[i] = vetor1[j];
		vetor3[i+1] = vetor2[j];
	}
	
	
	
	Imprime_vetor vetor = new Imprime_vetor();
	vetor.imprimeInt(vetor1);
	System.out.println();
	vetor.imprimeInt(vetor2);
	System.out.println();
	vetor.imprimeInt(vetor3);
	
	sc.close();
	
	
	}

}
