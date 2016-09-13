package trab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Ponto p = new Ponto();
		Pokemon pk = new Pokemon();
		
		pk.gerarListaPoke();
		p.gerarPontos();
		p.mostrarLista();
	}
}
