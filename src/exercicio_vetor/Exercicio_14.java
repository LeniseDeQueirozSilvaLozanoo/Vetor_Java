package exercicio_vetor;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		
//		14. Utilizando listas fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:

//			a. "Telefonou para a v�tima?"
//			b. "Esteve no local do crime?"
//			c. "Mora perto da v�tima?"
//			d. "Devia para a v�tima?"
//			e. "J� trabalhou com a v�tima?" 
//			O programa deve no final emitir uma
//			classifica��o sobre a participa��o da pessoa no crime. Se a pessoa
//			responder positivo a 2 quest�es ela deve ser classificada como "Suspeita",
//			entre 3 e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser�
//			classificado como "Inocente".
		
		String telefonou = "";
		String esteve = "";
		String mora = "";
		String devia = "";
		String trabalhou = "";


		Scanner sc = new Scanner(System.in);
		
		int i = 0, sim = 0;
		
		Exercicio_14Perguntas[] suspeito = new Exercicio_14Perguntas[1];
		
		for(i=0; i<suspeito.length; i++) {
			System.out.println("Suspeito " + (i+1) + " vc TELEFONOU para a v�tima?");
			telefonou = sc.next();
			System.out.println("Suspeito " + (i+1) + " vc ESTEVE no local do crime?");
			esteve = sc.next();
			System.out.println("Suspeito " + (i+1) + " vc MORA perto da v�tima?");
			mora = sc.next();
			System.out.println("Suspeito " + (i+1) + " vc DEVIA para a v�tima?");
			devia = sc.next();
			System.out.println("Suspeito " + (i+1) + " vc J� TRABALHOU com a v�tima?");
			trabalhou = sc.next();
			
			suspeito[i] = new Exercicio_14Perguntas(telefonou, esteve, mora, devia, trabalhou);
			
		}
		
		for(i=0; i<suspeito.length; i++) {
			System.out.println(
					"\n Telefonou: " + suspeito[i].telefonou + 
					"\n Esteve: " + suspeito[i].esteve + 
					"\n Mora: " + suspeito[i].mora + 
					"\n Devia: " + suspeito[i].devia + 
					"\n Trabalhou: " + suspeito[i].trabalhou + 
					"\n------------------------------------------\n ");
		}
		
		for(i=0; i<suspeito.length; i++) {
			
			if(suspeito[i].telefonou.equals("s")) {
				sim += 1;
			} 
		
			
			if(suspeito[i].esteve.equals("s")) {
				sim += 1;
			}
		
			if(suspeito[i].mora.equals("s")) {
				sim += 1;
			}
		
			if(suspeito[i].devia.equals("s")) {
				sim += 1;
			}
		
			if(suspeito[i].trabalhou.equals("s")) {
				sim += 1;
			}
			
		}
		
		if(sim == 2) {
			System.out.println("Vc � suspeito SUSPEITO do crime!!");
		} else if(sim >2 & sim <5) {
			System.out.println("Vc � C�MPLICE do crime!!");
		}else if(sim == 5) {
			System.out.println("ASSASSINOOOOO!!!!!!!!!!!!!!!");
		} else {
			System.out.println("Parab�ns, vc � INOCENTE... mas vamos ficar de olho em vc.");
		}

		
		
		sc.close();
	}

}
