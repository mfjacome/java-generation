package PacoteJava;

import java.util.Scanner;
import java.lang.Math;
public class Exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1, x2, y1, y2, d, p1, p2;
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite um valor:\n");
			x1 = ler.nextDouble();
			System.out.println("Digite um valor:\n");
			x2 = ler.nextDouble();
			System.out.println("Digite um valor:\n");
			y1 = ler.nextDouble();
			System.out.println("Digite um valor:\n");
			y2 = ler.nextDouble();
		}
		p1 = Math.pow(x2 - x1, 2);
		p2 = Math.pow(y2 - y1, 2);
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distância entre os pontos é:\n"+ Math.round(d));
	}
}
