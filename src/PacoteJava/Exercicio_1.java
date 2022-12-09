package PacoteJava;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idadeAnos, idadeMeses, idadeDias;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Informe sua idade em qtd. dias: \n");
			idadeDias = entrada.nextInt();
		}
		
		idadeAnos = (idadeDias / 365);
		System.out.println("A idade informada é: "+ idadeAnos +" anos \n");
		
		idadeMeses = (idadeDias * 12) / 365;
		System.out.println("A idade informada é: "+ idadeMeses +" meses \n");
	}

}
