package trab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Ponto pt = new Ponto();
		Pokemon poke = new Pokemon();
		int opc = 0;

		do {
			System.out.print("PokemonUENP\n" + "1 - Gerar Pokemons\n" + "2 - Consultar coordenadas de Pokemons\n"
					+ "Escolha a opção: ");
			opc = scan.nextInt();
			switch (opc) {
			case 1:
				System.out.print("Gerando pokemons...");
				int quantidade;
				quantidade = poke.gerarPokemon();
				System.out.println("OK\n");
				break;
			case 2:
				break;
			}

		} while (opc != 3);
	}
}
