package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
//		5. Fa�a um Programa que leia 20 n�meros inteiros e armazene-os num vetor. Armazene os n�meros pares no vetor PAR e os n�meros 
//		�MPARES no vetor �mpar. Imprima os tr�s vetores.

		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[20];
		int par[] = null;
		int impar[] = null;
		int i = 0;
		int contPar = 0;
		int contImpar = 0;
		
		for(i=0; i<numeros.length; i++) {
			
			System.out.println("Digite o " + (i+1) + "� n�mero de 20:");
			numeros[i] = sc.nextInt();
		
			if(numeros[i] % 2 == 0) {
				contPar += 1;
			} else {
				contImpar += 1;
			}

		}
		par = new int[contPar];
		impar = new int[contImpar];
			
		int indicePar = 0;
		int indiceImpar = 0;
		for(int n=0; n<numeros.length; n++) {
			
			if(numeros[n] % 2 == 0) {
				par[indicePar] = numeros[n];
				indicePar++;
			} else {
				impar[indiceImpar] = numeros[n];
				indiceImpar++;
			}
				
		}
		

		

	
			
			
		Imprime_vetor vetor = new Imprime_vetor();
		
		vetor.imprimeInt(numeros);
		System.out.println();

		vetor.imprimeInt(par);
		System.out.println();
		
		vetor.imprimeInt(impar);
		System.out.println();

		sc.close();
			
	}


}
