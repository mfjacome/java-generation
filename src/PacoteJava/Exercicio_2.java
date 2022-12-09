package PacoteJava;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tempoMinutos, tempoHoras, tempoSegundos;
		try (Scanner entrada = new Scanner(System.in)){
			System.out.println("Qual o tempo de um evento na produção em segundos? \n");
			tempoSegundos = entrada.nextDouble();
		}
		 tempoHoras = (tempoSegundos / 3600);
		 System.out.println("A quantidade em horas de um evento é: "+ tempoHoras +" hr \n");
		
		 tempoMinutos = ((tempoSegundos%3600)/60);
		 System.out.println("A quantidade em minutos de um evento é: "+ tempoMinutos +" m \n");
		 
		 tempoSegundos = ((tempoSegundos%3600)%60);
		 System.out.println("A quantidade em segundos de um evento é: "+ tempoSegundos +" s \n");

	}

}
