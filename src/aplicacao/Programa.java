package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorTotal = 0;
		
		System.out.print("Digite o numero de lados da figura plana: ");
		int lado = sc.nextInt();
		
		System.out.println("");
		System.out.println("Digite os valores dos lados:");
		
		for(int i = 1; i <= lado; i++) {
			System.out.print("Lado 0"+ i + ": ");
			double valorLado = sc.nextDouble();
			
			valorTotal += valorLado;

		}
		System.out.println("");
		System.out.println("Numero de lados: " + lado);
		System.out.println("Valor do perimetro: " + valorTotal);
		
		sc.close();
	}

}
