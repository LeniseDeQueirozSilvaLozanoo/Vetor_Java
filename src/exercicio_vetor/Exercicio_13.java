package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		
//		13. Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista. 
//		Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual, 
//		e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).

		
		Scanner sc = new Scanner(System.in);
		
		
		int quant = 12;
		Exercicio_13Mes[] meses = new Exercicio_13Mes[quant];
		
		
		String mes = "";
		double temp = 0;
		int i = 0;
		double media = 0;
		
		for(i=0; i<meses.length; i++) {
			
			System.out.println("Digite o " + (i+1) + "º mês:");
			mes = sc.next();
			System.out.println("Digite a temperatura do " + (i+1) + "º mês:");
			temp = sc.nextDouble();
			meses[i] = new Exercicio_13Mes(mes, temp);
		}
		
		
		for(i=0; i<meses.length; i++) {
			media += meses[i].temp/quant;
		}
				
		for(i=0; i<meses.length; i++) {
			System.out.println("O mês é " + meses[i].nome + " e a sua temperatura média: " + meses[i].temp + "°C \n");
		}
		
		for(i=0; i<meses.length; i++) {
			
			if (meses[i].temp > media) {
				System.out.println("O mês " + meses[i].nome + " teve a temperatura: " + meses[i].temp + "°C --ACIMA DA MÉDIA ANUAL--\n");
			}
		}
		
		System.out.printf("A temperatura média anual é %.2f%n" , media,  "°C");
		
		sc.close();
		
	}

}
