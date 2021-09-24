package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprograma {

	public static void main(String[] args) {
		gato gato = new gato();
		Livro livro = new Livro();

		System.out.println(gato);
		System.out.println(livro);

	}
}

class Livro {
	public String nome;
	public Integer numPaginas;
	
	/*
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		System.out.println("Hellow World!" + (a+b));
		}
	 */
}