package trab;

import java.util.Random;

public class Pokemon {
	
	Ponto pontoPoke = new Ponto();

	public int gerarPokemon() {
		Random random = new Random();
		int min = 50;
		int quantidade = random.nextInt(min) + min;
		// System.out.println(quantidade);
		return quantidade;
	}
	
}
