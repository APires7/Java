package trab;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Ponto pt = new Ponto();
		Pokemon poke = new Pokemon();
		
		int quantidade;
		quantidade = poke.gerarPokemon();
		pt.gerarPonto(quantidade);

	}
}
