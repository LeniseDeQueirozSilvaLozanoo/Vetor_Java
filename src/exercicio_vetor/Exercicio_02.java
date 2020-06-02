package exercicio_vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		//2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.  
		
		Scanner sc = new Scanner(System.in);
		
		int[] numero = new int[10];
		int i = 0;
		
		for(i=0; i<numero.length;i++) {
			System.out.println("Digite o " + (i+1) + "º numero de 10");
			numero[i] = sc.nextInt();
		}
		
		
		for(i=1; i<numero.length; i ++) {
			for (int j = 0; j < i; j++) {
				if(numero[i] > numero[j]) {
				int aux = numero[i];
				numero[i] = numero[j];
				numero[j] = aux;
				
				}
			}
		}
		
		for(i=0; i<numero.length; i++) {
			System.out.print(numero[i] + " ");
		}

	sc.close();
	
	}
	

}
