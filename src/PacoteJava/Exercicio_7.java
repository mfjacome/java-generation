package PacoteJava;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double custoFabrica, porcentDistribuidor, imposto, precoCarNovo;
		try(Scanner entrada = new Scanner(System.in)){
			System.out.println("Qual preço de fábrica? ");
			custoFabrica = entrada.nextFloat();
		}
		porcentDistribuidor = (custoFabrica * 0.28);
		imposto = (custoFabrica * 0.45);
		
		precoCarNovo = (custoFabrica + porcentDistribuidor + imposto);
		
		System.out.println("O preço final do carro é: "+ precoCarNovo);
	}

}
