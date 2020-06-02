package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {

		
//		4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

		
		Scanner sc = new Scanner(System.in);
		
		char[] letras = new char[10];
		int i = 0;
		int vogais = 0;
		int consoantes = 0;
		String letrasConsoantes = " ";
		for(i = 0; i < letras.length; i++) {
			System.out.println("Digite a " + (i+1) + "ª letra de 10");
			letras[i] = sc.next().charAt(0);
		
			if(letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u') {
				vogais += 1;
			} else {
				consoantes += 1;
				letrasConsoantes += letras[i] + " ";
			}
		
		
		}
		

		
//		Imprime_vetor v = new Imprime_vetor();
//		v.imprimeChar(letras);

		System.out.println();
		System.out.println("Foram digitadas " + consoantes + " letras consoantes");
		System.out.println("A consoantes digitadas foram: " + letrasConsoantes);
		
		sc.close();

	}

}
