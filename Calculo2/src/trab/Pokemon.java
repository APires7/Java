package trab;

import java.util.ArrayList;
import java.util.Random;

public class Pokemon {

	String nome;
	int num;
	String tipo;
	double cordX;
	double cordY;
	double cordZ;
	boolean aceito;

	ArrayList<Pokemon> pokeDex = new ArrayList<Pokemon>();

	public Pokemon() {
		nome = "";
		num = 0;
		tipo = "";
		cordX = 0;
		cordY = 0;
		cordZ = 0;
		aceito = false;
	}

	public Pokemon(String nomes, int numero, String tipos, double cX, double cY, double cZ, boolean acc) {
		nome = nomes;
		num = numero;
		tipo = tipos;
		cordX = cX;
		cordY = cY;
		cordZ = cZ;
		aceito = acc;
	}

	public ArrayList<Pokemon> gerarListaPoke() {
		Pokemon P1 = new Pokemon("Bulbasaur", 1, "Grama", 0, 0, 0, false);
		Pokemon P2 = new Pokemon("Ivisaur", 2, "Grama", 0, 0, 0, false);
		Pokemon P3 = new Pokemon("Venusaur", 3, "Grama", 0, 0, 0, false);
		Pokemon P4 = new Pokemon("Charmander", 4, "Fogo", 0, 0, 0, false);
		Pokemon P5 = new Pokemon("Charmeleon", 5, "Fogo", 0, 0, 0, false);
		Pokemon P6 = new Pokemon("Charizard", 6, "Fogo", 0, 0, 0, false);
		Pokemon P7 = new Pokemon("Squirtle", 7, "Água", 0, 0, 0, false);
		Pokemon P8 = new Pokemon("Wartortle", 8, "Água", 0, 0, 0, false);
		Pokemon P9 = new Pokemon("Blastoise", 9, "Água", 0, 0, 0, false);
		Pokemon P10 = new Pokemon("Caterpie", 10, "Solo", 0, 0, 0, false);
		Pokemon P11 = new Pokemon("Metapod", 11, "Grama", 0, 0, 0, false);
		Pokemon P12 = new Pokemon("Butterfree", 12, "Voador", 0, 0, 0, false);
		Pokemon P13 = new Pokemon("Weedle", 13, "Solo", 0, 0, 0, false);
		Pokemon P14 = new Pokemon("Kakuna", 14, "Grama", 0, 0, 0, false);
		Pokemon P15 = new Pokemon("Beedrill", 15, "Voador", 0, 0, 0, false);
		Pokemon P16 = new Pokemon("Pidgey", 16, "Voador", 0, 0, 0, false);
		Pokemon P17 = new Pokemon("Pideotto", 17, " Voador", 0, 0, 0, false);
		Pokemon P18 = new Pokemon("Pideot", 18, "Voador", 0, 0, 0, false);
		Pokemon P19 = new Pokemon("Ratata", 19, "Solo", 0, 0, 0, false);
		Pokemon P20 = new Pokemon("Raticate", 20, "Solo", 0, 0, 0, false);
		Pokemon P21 = new Pokemon("Spearow", 21, "Voador", 0, 0, 0, false);
		Pokemon P22 = new Pokemon("Fearow", 22, "Voador", 0, 0, 0, false);
		Pokemon P23 = new Pokemon("Ekans", 23, "Solo", 0, 0, 0, false);
		Pokemon P24 = new Pokemon("Arbok", 24, "Solo", 0, 0, 0, false);
		Pokemon P25 = new Pokemon("Pikachu", 25, "Elétrico", 0, 0, 0, false);
		Pokemon P26 = new Pokemon("Raichu", 26, "Elétrico", 0, 0, 0, false);
		Pokemon P27 = new Pokemon("Sandshew", 27, "Solo", 0, 0, 0, false);
		Pokemon P28 = new Pokemon("Sandslash", 28, "Solo", 0, 0, 0, false);
		Pokemon P29 = new Pokemon("Nidoram (M)", 29, "Solo", 0, 0, 0, false);
		Pokemon P30 = new Pokemon("Nidorino", 30, "Solo", 0, 0, 0, false);
		Pokemon P31 = new Pokemon("Nidoking", 31, "Solo", 0, 0, 0, false);
		Pokemon P32 = new Pokemon("Nidoram (F)", 32, "Solo", 0, 0, 0, false);
		Pokemon P33 = new Pokemon("Nidorina", 33, "Solo", 0, 0, 0, false);
		Pokemon P34 = new Pokemon("Nidoqueen", 34, "Solo", 0, 0, 0, false);
		Pokemon P35 = new Pokemon("Clefary", 35, "Solo", 0, 0, 0, false);
		Pokemon P36 = new Pokemon("Clafable", 36, "Solo", 0, 0, 0, false);
		Pokemon P37 = new Pokemon("Vulpix", 37, "Fogo", 0, 0, 0, false);
		Pokemon P38 = new Pokemon("Ninetails", 38, "Fogo", 0, 0, 0, false);
		Pokemon P39 = new Pokemon("Jigglypuff", 39, "Solo", 0, 0, 0, false);
		Pokemon P40 = new Pokemon("Wigglypuff", 40, "Solo", 0, 0, 0, false);
		Pokemon P41 = new Pokemon("Zubat", 41, "Voador", 0, 0, 0, false);
		Pokemon P42 = new Pokemon("Golbat", 42, "Voador", 0, 0, 0, false);
		Pokemon P43 = new Pokemon("Oddish", 43, "Solo", 0, 0, 0, false);
		Pokemon P44 = new Pokemon("Gloom", 44, "Solo", 0, 0, 0, false);
		Pokemon P45 = new Pokemon("Vileplume", 45, "Solo", 0, 0, 0, false);
		Pokemon P46 = new Pokemon("Paras", 46, "Solo", 0, 0, 0, false);
		Pokemon P47 = new Pokemon("Parasect", 47, "Solo", 0, 0, 0, false);
		Pokemon P48 = new Pokemon("Venonat", 48, "Solo", 0, 0, 0, false);
		Pokemon P49 = new Pokemon("Venomoth", 49, "Voador", 0, 0, 0, false);
		Pokemon P50 = new Pokemon("Diglet", 50, "Solo", 0, 0, 0, false);
		Pokemon P51 = new Pokemon("Dugtrio", 51, "Solo", 0, 0, 0, false);
		Pokemon P52 = new Pokemon("Meowth", 52, "Solo", 0, 0, 0, false);
		Pokemon P53 = new Pokemon("Persian", 53, "Solo", 0, 0, 0, false);
		Pokemon P54 = new Pokemon("Psyduck", 54, "Água", 0, 0, 0, false);
		Pokemon P55 = new Pokemon("Golduck", 55, "Água", 0, 0, 0, false);
		Pokemon P56 = new Pokemon("Mankey", 56, "Solo", 0, 0, 0, false);
		Pokemon P57 = new Pokemon("Primape", 57, "Solo", 0, 0, 0, false);
		Pokemon P58 = new Pokemon("Growlithe", 58, "Fogo", 0, 0, 0, false);
		Pokemon P59 = new Pokemon("Arcanine", 59, "Fogo", 0, 0, 0, false);
		Pokemon P60 = new Pokemon("Poliwag", 60, "Água", 0, 0, 0, false);
		Pokemon P61 = new Pokemon("Poliwhirl", 61, "Água", 0, 0, 0, false);
		Pokemon P62 = new Pokemon("Poliwrath", 62, "Água", 0, 0, 0, false);
		Pokemon P63 = new Pokemon("Abra", 63, "Psychic", 0, 0, 0, false);
		Pokemon P64 = new Pokemon("Kadabra", 64, "Psychic", 0, 0, 0, false);
		Pokemon P65 = new Pokemon("Alakasam", 65, "Psychic", 0, 0, 0, false);
		Pokemon P66 = new Pokemon("Machop", 66, "Solo", 0, 0, 0, false);
		Pokemon P67 = new Pokemon("Machoke", 67, "Solo", 0, 0, 0, false);
		Pokemon P68 = new Pokemon("Machamp", 68, "Solo", 0, 0, 0, false);
		Pokemon P69 = new Pokemon("Tentacool", 69, "Água", 0, 0, 0, false);
		Pokemon P70 = new Pokemon("Tentacruel", 70, "Água", 0, 0, 0, false);
		Pokemon P71 = new Pokemon("Geodude", 71, "Pedra", 0, 0, 0, false);
		Pokemon P72 = new Pokemon("Graveler", 72, "Pedra", 0, 0, 0, false);
		Pokemon P73 = new Pokemon("Golem", 73, "Pedra", 0, 0, 0, false);
		Pokemon P74 = new Pokemon("Ponita", 74, "Fogo", 0, 0, 0, false);
		Pokemon P75 = new Pokemon("Rapidash", 75, "Fogo", 0, 0, 0, false);
		Pokemon P76 = new Pokemon("Slowpoke", 76, "Água", 0, 0, 0, false);
		Pokemon P77 = new Pokemon("Slowbro", 77, "Água", 0, 0, 0, false);
		Pokemon P78 = new Pokemon("Magnemite", 78, "Elétrico", 0, 0, 0, false);
		Pokemon P79 = new Pokemon("Magneton", 79, "Elétrico", 0, 0, 0, false);
		Pokemon P80 = new Pokemon("Doduo", 80, "Solo", 0, 0, 0, false);
		Pokemon P81 = new Pokemon("Dotrio", 81, "Solo", 0, 0, 0, false);
		Pokemon P82 = new Pokemon("Grimer", 82, "Solo", 0, 0, 0, false);
		Pokemon P83 = new Pokemon("Muk", 83, "Solo", 0, 0, 0, false);
		Pokemon P84 = new Pokemon("Shelder", 84, "Gelo", 0, 0, 0, false);
		Pokemon P85 = new Pokemon("Cloyster", 85, "Gelo", 0, 0, 0, false);
		Pokemon P86 = new Pokemon("Gastly", 86, "Fantasma", 0, 0, 0, false);
		Pokemon P87 = new Pokemon("Haunter", 87, "Fantasma", 0, 0, 0, false);
		Pokemon P88 = new Pokemon("Gengar", 88, "Fantasma", 0, 0, 0, false);
		Pokemon P89 = new Pokemon("Onix", 89, "Pedra", 0, 0, 0, false);
		Pokemon P90 = new Pokemon("Voltorb", 90, "Elétrico", 0, 0, 0, false);
		Pokemon P91 = new Pokemon("Electrode", 91, "Elétrico", 0, 0, 0, false);
		Pokemon P92 = new Pokemon("Cubone", 92, "Solo", 0, 0, 0, false);
		Pokemon P93 = new Pokemon("Marowak", 93, "Solo", 0, 0, 0, false);
		Pokemon P94 = new Pokemon("Elektabuzz", 94, "Elétrico", 0, 0, 0, false);
		Pokemon P95 = new Pokemon("Magmar", 95, "Fogo", 0, 0, 0, false);
		Pokemon P96 = new Pokemon("Tauros", 96, "Solo", 0, 0, 0, false);
		Pokemon P97 = new Pokemon("Articuno", 97, "Voador", 0, 0, 0, false);
		Pokemon P98 = new Pokemon("Zapdos", 98, "Voador", 0, 0, 0, false);
		Pokemon P99 = new Pokemon("Moltres", 99, "Voador", 0, 0, 0, false);
		Pokemon P100 = new Pokemon("Mew", 100, "Psychic", 0, 0, 0, false);

		return pokeDex;
	}

}
