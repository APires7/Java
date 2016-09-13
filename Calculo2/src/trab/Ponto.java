package trab;

import java.util.ArrayList;
import java.util.Random;

public class Ponto {

	protected int areaX = 10400;
	protected int areaY = 16200;
	protected int areaZ = 4;

	static int x;
	static int y;
	static int z;

	Pokemon poke = new Pokemon();
	ArrayList<Pokemon> pokem = new ArrayList<Pokemon>();

	public void gerarPontos() {// Gera as coordenadas dos pokemons colocando-os
								// na lista
		for (int i = 0; i < poke.pokedex.size(); i++) {

			Random randomR = new Random();
			int X = randomR.nextInt(180);

			double x = cordenadaX(X);
			poke.pokedex.get(i).cordX = x;

			double y = cordenadaY(X);
			poke.pokedex.get(i).cordY = y;

			double z = cordenadaZ(X,i);
			poke.pokedex.get(i).cordZ = z;

			verificaCoord(x, y, z, i);
			CompararPontos(i);

		}
	}

	public void CompararPontos(int i) {// Calcula a distância entre dois
										// pokemóns

		for (int j = 0; j < poke.pokedex.size(); j++) {
			double valorDist = 0;
			double calcX = 0;
			double calcY = 0;
			double calcZ = 0;
			if (j == i) {
				j++;
			}
			calcX = poke.pokedex.get(j).cordX + poke.pokedex.get(i).cordX;
			calcY = poke.pokedex.get(j).cordY + poke.pokedex.get(i).cordY;
			calcZ = poke.pokedex.get(j).cordZ + poke.pokedex.get(i).cordZ;
			valorDist = Math.sqrt(Math.pow(calcX, 2) + Math.pow(calcY, 2) + Math.pow(calcZ, 2)); // Aqui
			if (valorDist >= 5) {
				pokem.get(j).aceito = true;
			} else if (valorDist < 5) {
				pokem.get(j).aceito = false;
			}
		}

	}

	public void mostrarLista() {// Sera mostrado a lista de pokemons que seram
								// dispostos na area

		for (int i = 0; i < poke.pokedex.size(); i++) {
			if (poke.pokedex.get(i).aceito == true) {
				System.out.println("Numero: " + poke.pokedex.get(i).num);
				System.out.println("Nome: " + poke.pokedex.get(i).nome);
				System.out.println("Tipo: " + poke.pokedex.get(i).tipo);
				System.out.println("cordX: " + poke.pokedex.get(i).cordX);
				System.out.println("cordY: " + poke.pokedex.get(i).cordY);
				System.out.println("cordZ:" + poke.pokedex.get(i).cordZ);
				System.out.println("---------------");
			}
		}
	}

	void verificaCoord(double a, double b, double c, int pos) {
		if (a < areaX && b < areaY && c < areaZ) {
			pokem.get(pos).aceito = true;
		}
	}


	public double cordenadaX(int R) { // gera a cordenadaX
		
		double X = 0 ;
		X = Math.pow(R, 2)/3;
		return X;
		
	}

	public double cordenadaY(int R) {// gera a cordenadaY
		
		double Y = 0;
		Y = Math.pow(R, 2)/2;
		return Y;
		
	}

	public double cordenadaZ(int R,int i) {// gera a cordenadaZ
		
		double Z = 0;
		if(poke.pokedex.get(i).tipo == "voador"){
			Z = Math.sin(R) + 2;
		}
		else{
			Z = Math.sin(R);
		}
		
		return Z;
	}

}
