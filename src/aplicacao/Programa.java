package aplicacao;

import java.util.Scanner;

import util.Calcular;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorTotal = 0;
		double area;
		
		System.out.println("Calculadora de figuras planas");
		System.out.println("Digite a operação que deseja fazer: A - Area ou B - Perimetro");
		char oper = sc.next().charAt(0);  
		
		if(oper == 'a') {
			System.out.println("Qual figura você deseja saber a area?");
			System.out.println("1 - Quadrado/Retangulo / 2 - Triangulo");
			int x = sc.nextInt();
			
			if (x == 1) {
				System.out.println("Digite o valor de dois lados(para retangulos, necessario digitar o valor do maior e menor lado):");
				System.out.print("lado 1(em cm): ");
				double ladoUm = sc.nextInt();
				System.out.print("lado 2(em cm): ");
				double ladoDois = sc.nextInt();
				area = Calcular.areaSimples(ladoUm, ladoDois);
				System.out.println("Area: "+ area+"cm²");
				
			} else {
				System.out.println("Digite os valores do(a):");
				System.out.print("base: ");
				int base = sc.nextInt();
				System.out.print("altura: ");
				int altura = sc.nextInt();
				area = Calcular.areaSimples(base, altura);
				System.out.println("Area Triangulo: "+ area+"cm²");
				
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
