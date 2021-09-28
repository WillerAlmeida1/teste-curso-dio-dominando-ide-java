package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro numero: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = scan.nextInt();
		
		int soma = soma (a,b);
		int subtracao = subtracao (a,b);
		float divisao = divisao (a,b);
		int multiplicacao = multiplicacao (a,b);
		
		System.out.println("soma " + soma);
		System.out.println("Sub " + subtracao);
		System.out.println("Div " + divisao);
		System.out.println("Multi " + multiplicacao);
		


	}
	
	public static int soma(int a, int b){
		return a + b;
	}
	
	public static int subtracao(int a, int b){
		return a - b;
	}
	public static float divisao(float a, float b){
		return a / b;
	}
	public static int multiplicacao(int a, int b){
		return a * b;
	}
}
