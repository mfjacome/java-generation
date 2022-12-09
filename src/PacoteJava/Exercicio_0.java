package PacoteJava;

import java.util.Scanner;

public class Exercicio_0 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idadeAnos, idadeMeses, idadeDias;
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Informe a idade em anos:\n ");
			idadeAnos = ler.nextInt();
		};
		System.out.println("A idade informada é: "+ idadeAnos +" anos \n");

		idadeMeses = (idadeAnos * 12);
		
		idadeDias = (idadeMeses * 365);
		
		System.out.println("A idade informada em qtd de dias é: "+ idadeDias +" dias \n");

	}

}
