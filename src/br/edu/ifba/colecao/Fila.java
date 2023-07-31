package br.edu.ifba.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	Queue<Object> listaFila = new LinkedList<Object>();
	
	
	public void adicionar(Object o) {
		listaFila.add(o);
	}
	
	public String remover() {
		return listaFila.remove().toString();
	}
	
	public String listar() {
		return listaFila.toString();
	}
	
	public boolean verificarVazio() {
		return listaFila.isEmpty();
	}
	
	public String inverterFila() {
		int tamanho = listaFila.size();
		Queue<Object> listaFilaInvertida = new LinkedList<Object>();
		for(int cont = 0; cont < tamanho; cont++) {
			for(int i = 0; i < listaFila.size() - 1; i++) {
				Object aux = listaFila.peek();
				listaFila.remove();
				listaFila.add(aux);
			}
			listaFilaInvertida.add(listaFila.peek());
			listaFila.remove();
		}
		return listaFilaInvertida.toString();
	}

}
