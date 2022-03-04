package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorTotal = 0;
		
		System.out.println("Calculadora de figuras planas");
		System.out.println("Digite a operação que deseja fazer: A - area ou B - perimetro");
		char oper = sc.next().charAt(0);  
		
		if(oper == 'a') {
			System.out.println("Qual figura você deseja saber a area?");
			System.out.println("1 - quadrado / 2 - retangulo / 3 - triangulo");
			int x = sc.nextInt();
			
			if (x == 1) {
				System.out.print("Digite o valor de um dos lados:");
				int ladoQ = sc.nextInt();
				
				System.out.println("Valor de Area do Quadrado: " + ladoQ * ladoQ);
			} else if (x == 2) {
				
				System.out.println("Digite os valores do:");
				System.out.print("Lado Maior:");
				int ladoRe = sc.nextInt();
				System.out.print("Lado Menor:");
				int ladoR = sc.nextInt();
				System.out.println("Valor de Area do Retangulo: " + ladoRe * ladoR);
				
			} else {
				System.out.println("Digite os valores do(a):");
				System.out.print("base: ");
				int base = sc.nextInt();
				System.out.print("base: ");
				int altura = sc.nextInt();
				
				System.out.println("Valor de Area do Retangulo: " + (base*altura)/2 );
			}
			
		} else if (oper == 'p') {
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
		}
		
		sc.close();
	}

}
