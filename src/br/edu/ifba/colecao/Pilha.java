package br.edu.ifba.colecao;

import java.util.Stack;

public class Pilha {
	
	Stack<Object> listaPilha = new Stack<Object>(); 
	Stack<Object> listaPilhaAuxiliar = new Stack<Object>(); 
	Stack<Object> listaPilhaInvertida = new Stack<Object>(); 
	
	public void adicionar(Object o) {
		this.listaPilha.push(o);
		this.listaPilhaAuxiliar.push(o);
	}
	
	public String remover() {
		listaPilhaAuxiliar.pop();
		return this.listaPilha.pop().toString();
	}
	
	public String listar() {
		return this.listaPilha.toString();
	}
	
	public String listarInvertida() {
		return this.listaPilhaInvertida.toString();
	}
	
	public boolean verificarVazio() {
		return this.listaPilha.isEmpty();
	}
	
	public boolean palindromo() {
		for(int i = 0; i < listaPilha.size(); i++) {
			listaPilhaInvertida.add(listaPilhaAuxiliar.lastElement());
			listaPilhaAuxiliar.pop();
		}
		if(listaPilha.equals(listaPilhaInvertida)) {
			return true;
		}
		return false;
	}

}
