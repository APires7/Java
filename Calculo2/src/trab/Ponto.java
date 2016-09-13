package trab;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class Ponto {

	protected int areaX = 13000;
	protected int areaY = 13000;
	protected int areaZ = 4;

	Pokemon poke = new Pokemon();

	ArrayList<Pokemon> pokem = new ArrayList<Pokemon>();pokem=poke.geraListaPoke();

	public void gerarPontos() {// gera as coordenadas dos pokemons colocando-os
								// na lista
		for (int i = 0; i < pokem.size(); i++) {

			double R = geraR();

			double x = cordenadaX(R);
			pokem[i].cordX = x;

			double y = cordenadaY(R);
			pokem[i].cordY = y;

			double z = cordenadaZ(R);
			pokem[i].cordZ = z;

			verificaCoord(x, y, z, i);
			CompararPontos(i);

		}
	}

	public void CompararPontos(int i) {// É calculado a distancia entre dois
										// pokemos

		for (int j = 0; j < pokem.size(); j++) {
			double valorDist = 0;
			double calcX = 0;
			double calcY = 0;
			double calcZ = 0;
			if (j == i) {
				j++;
			}
			calcX = pokem[j].cordX + pokem[i].cordX;
			calcX = pokem[j].cordY + pokem[i].cordY;
			calcX = pokem[j].cordZ + pokem[i].cordZ;
			valorDist = Math.sqrt(Math.pow(calcX, 2) + Math.pow(calcY, 2) + Math.pow(calcZ, 2)); // Aqui
			if (valorDist >= 5) {
				pokem[j].aceito = true;
			} else if (valorDist < 5) {
				pokem[j].aceito = false;
			}
		}

	}

	public void mostrarLista() {// Sera mostrado a lista de pokemons que seram
								// dispostos na area

		for (int i = 0; i < pokem.size(); i++) {
			if (pokem.aceito == true) {
				System.out.println("Numero: " + pokem[i].num);
				System.out.println("Nome: " + pokem[i].nome);
				System.out.println("Tipo: " + pokem[i].tipo);
				System.out.println("cordX: " + pokem[i].cordX);
				System.out.println("cordY: " + pokem[i].cordY);
				System.out.println("cordZ:" + pokem[i].cordZ);
				System.out.println("---------------");
			}
		}
	}

	void verificaCoord(double a, double b, double c, double pos) {
		if (a < areaX && b < areaY && c < areaZ) {
			pokem[pos].aceito = true;
		}
	}

	public double geraR() {
		Random randomR = new Random();
		int valorX = randomR.nextInt(5000);
		double funcao = ((valorX) / 2) * Math.pow(3, 2);

		return funcao;
	}

	public double cordenadaX(double R) { // gera a cordenadaX

	}

	public double cordenadaY(double R) {// gera a cordenadaY

	}

	public double cordenadaZ(double R) {// gera a cordenadaZ

	}
}
