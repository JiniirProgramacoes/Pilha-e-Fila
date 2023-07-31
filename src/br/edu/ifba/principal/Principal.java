package br.edu.ifba.principal;

import br.edu.ifba.colecao.Fila;
import br.edu.ifba.colecao.Pilha;

public class Principal {
	
	public static void main(String[] args) {
		
		//Questão Pilha
		Pilha p = new Pilha();
		String item = "joao";
		char[] itemChar = item.toCharArray();
		for(int i = 0; i < itemChar.length;i++) {
			p.adicionar(itemChar[i]);
		}
		System.out.println(p.listar());
		if(p.palindromo()) {
			System.out.println("A palavra é um palindromo");
			System.out.println(p.listarInvertida());
		}else {
			System.out.println("A palavra não é um palindromo");
			System.out.println(p.listarInvertida());
		}
		System.out.println(p.listar());
		
		
		//Questão Fila
		Fila f = new Fila();
		f.adicionar(14);
		f.adicionar(20);
		f.adicionar(27);
		f.adicionar(72);
		System.out.println(f.listar());
		System.out.println(f.inverterFila());
	}

}
