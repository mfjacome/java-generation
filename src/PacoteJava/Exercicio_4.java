package PacoteJava;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, somaPesos, media;
		try (Scanner recebe = new Scanner(System.in)) {
			System.out.println("Informe a nota:\n");
			n1 = recebe.nextDouble();
			n2 = recebe.nextDouble();
			n3 = recebe.nextDouble();
		}
		somaPesos = (2 + 3 + 5);
		
		media = ((n1*2)+(n2*3)+(n3*5))/ somaPesos;
		System.out.println("A média final é:\n"+ media);
	}

}
