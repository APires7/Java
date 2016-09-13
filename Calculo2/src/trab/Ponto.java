package trab;

import java.util.ArrayList;
import java.util.Random;

public class Ponto {

	protected int areaX = 13000;
	protected int areaY = 13000;
	protected int areaZ = 4;

	static int x;
	static int y;
	static int z;

	Pokemon poke = new Pokemon();
	ArrayList<Pokemon> pokem = new ArrayList<Pokemon>();

	public void gerarPontos() {// Gera as coordenadas dos pokemons colocando-os
								// na lista
		for (int i = 0; i < pokem.size(); i++) {

			double R = geraR();

			double x = cordenadaX(R);
			poke.pokeDex.get(i).cordX = x;

			double y = cordenadaY(R);
			poke.pokeDex.get(i).cordY = y;

			double z = cordenadaZ(R);
			poke.pokeDex.get(i).cordZ = z;

			verificaCoord(x, y, z, i);
			CompararPontos(i);

		}
	}

	public void CompararPontos(int i) {// Calcula a distância entre dois
										// pokemóns

		for (int j = 0; j < poke.pokeDex.size(); j++) {
			double valorDist = 0;
			double calcX = 0;
			double calcY = 0;
			double calcZ = 0;
			if (j == i) {
				j++;
			}
			calcX = poke.pokeDex.get(j).cordX + poke.pokeDex.get(i).cordX;
			calcY = poke.pokeDex.get(j).cordY + poke.pokeDex.get(i).cordY;
			calcZ = poke.pokeDex.get(j).cordZ + poke.pokeDex.get(i).cordZ;
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

		for (int i = 0; i < poke.pokeDex.size(); i++) {
			if (poke.pokeDex.get(i).aceito == true) {
				System.out.println("Numero: " + poke.pokeDex.get(i).num);
				System.out.println("Nome: " + poke.pokeDex.get(i).nome);
				System.out.println("Tipo: " + poke.pokeDex.get(i).tipo);
				System.out.println("cordX: " + poke.pokeDex.get(i).cordX);
				System.out.println("cordY: " + poke.pokeDex.get(i).cordY);
				System.out.println("cordZ:" + poke.pokeDex.get(i).cordZ);
				System.out.println("---------------");
			}
		}
	}

	void verificaCoord(double a, double b, double c, int pos) {
		if (a < areaX && b < areaY && c < areaZ) {
			pokem.get(pos).aceito = true;
		}
	}

	public double geraR() {
		Random randomR = new Random();
		int valorX = randomR.nextInt(5000);
		double funcao = ((valorX) / 2) * Math.pow(3, 2);

		return funcao;
	}

	public double cordenadaX(double R) { // gera a cordenadaX
		return R;
	}

	public double cordenadaY(double R) {// gera a cordenadaY
		return R;
	}

	public double cordenadaZ(double R) {// gera a cordenadaZ
		return R;
	}

}
