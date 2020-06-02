package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		
//		13. Fa�a um programa que receba a temperatura m�dia de cada m�s do ano e armazene-as em uma lista. 
//		Ap�s isto, calcule a m�dia anual das temperaturas e mostre todas as temperaturas acima da m�dia anual, 
//		e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro, . . . ).

		
		Scanner sc = new Scanner(System.in);
		
		
		int quant = 12;
		Exercicio_13Mes[] meses = new Exercicio_13Mes[quant];
		
		
		String mes = "";
		double temp = 0;
		int i = 0;
		double media = 0;
		
		for(i=0; i<meses.length; i++) {
			
			System.out.println("Digite o " + (i+1) + "� m�s:");
			mes = sc.next();
			System.out.println("Digite a temperatura do " + (i+1) + "� m�s:");
			temp = sc.nextDouble();
			meses[i] = new Exercicio_13Mes(mes, temp);
		}
		
		
		for(i=0; i<meses.length; i++) {
			media += meses[i].temp/quant;
		}
				
		for(i=0; i<meses.length; i++) {
			System.out.println("O m�s � " + meses[i].nome + " e a sua temperatura m�dia: " + meses[i].temp + "�C \n");
		}
		
		for(i=0; i<meses.length; i++) {
			
			if (meses[i].temp > media) {
				System.out.println("O m�s " + meses[i].nome + " teve a temperatura: " + meses[i].temp + "�C --ACIMA DA M�DIA ANUAL--\n");
			}
		}
		
		System.out.printf("A temperatura m�dia anual � %.2f%n" , media,  "�C");
		
		sc.close();
		
	}

}
