package trab;

import java.util.ArrayList;

public class Pokemon {

	public String nome;
	public int num;
	public String tipo;
	public double cordX;
	public double cordY;
	public double cordZ;
	public boolean aceito;

	ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
    
	
	public ArrayList<Pokemon> getPokedex() {
		return pokedex;
	}

	public void setPokedex(ArrayList<Pokemon> pokedex) {
		this.pokedex = pokedex;
	}

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
		
		pokedex.add(0,P1);
		pokedex.add(1,P2);
		pokedex.add(2,P3);
		pokedex.add(3,P4);
		pokedex.add(4,P5);
		pokedex.add(5,P6);
		pokedex.add(6,P7);
		pokedex.add(7,P8);
		pokedex.add(8,P9);
		pokedex.add(9,P10);
		pokedex.add(10,P11);
		pokedex.add(11,P12);
		pokedex.add(12,P13);
		pokedex.add(13,P14);
		pokedex.add(14,P15);
		pokedex.add(15,P16);
		pokedex.add(16,P17);
		pokedex.add(17,P18);
		pokedex.add(18,P19);
		pokedex.add(19,P20);
		pokedex.add(20,P21);
		pokedex.add(21,P22);
		pokedex.add(22,P23);
		pokedex.add(23,P24);
		pokedex.add(24,P25);
		pokedex.add(25,P26);
		pokedex.add(26,P27);
		pokedex.add(27,P28);
		pokedex.add(28,P29);
		pokedex.add(29,P30);
		pokedex.add(30,P31);
		pokedex.add(31,P32);
		pokedex.add(32,P33);
		pokedex.add(33,P34);
		pokedex.add(34,P35);
		pokedex.add(35,P36);
		pokedex.add(36,P37);
		pokedex.add(37,P38);
		pokedex.add(38,P39);
		pokedex.add(39,P40);
		pokedex.add(40,P41);
		pokedex.add(41,P42);
		pokedex.add(42,P43);
		pokedex.add(43,P44);
		pokedex.add(44,P45);
		pokedex.add(45,P46);
		pokedex.add(46,P47);
		pokedex.add(47,P48);
		pokedex.add(48,P49);
		pokedex.add(49,P50);
		pokedex.add(50,P51);
		pokedex.add(51,P52);
		pokedex.add(52,P53);
		pokedex.add(53,P54);
		pokedex.add(54,P55);
		pokedex.add(55,P56);
		pokedex.add(56,P57);
		pokedex.add(57,P58);
		pokedex.add(58,P59);
		pokedex.add(59,P60);
		pokedex.add(60,P61);
		pokedex.add(61,P62);
		pokedex.add(62,P63);
		pokedex.add(63,P64);
		pokedex.add(64,P65);
		pokedex.add(65,P66);
		pokedex.add(66,P67);
		pokedex.add(67,P68);
		pokedex.add(68,P69);
		pokedex.add(69,P70);
		pokedex.add(70,P71);
		pokedex.add(71,P72);
		pokedex.add(72,P73);
		pokedex.add(73,P74);
		pokedex.add(74,P75);
		pokedex.add(75,P76);
		pokedex.add(76,P77);
		pokedex.add(77,P78);
		pokedex.add(78,P79);
		pokedex.add(79,P80);
		pokedex.add(80,P81);
		pokedex.add(81,P82);
		pokedex.add(82,P83);
		pokedex.add(83,P84);
		pokedex.add(84,P85);
		pokedex.add(85,P86);
		pokedex.add(86,P87);
		pokedex.add(87,P88);
		pokedex.add(88,P89);
		pokedex.add(89,P90);
		pokedex.add(90,P91);
		pokedex.add(91,P92);
		pokedex.add(92,P93);
		pokedex.add(93,P94);
		pokedex.add(94,P95);
		pokedex.add(95,P96);
		pokedex.add(96,P97);
		pokedex.add(97,P98);
		pokedex.add(98,P99);
		pokedex.add(99,P100);

		return pokedex;
	}

}
