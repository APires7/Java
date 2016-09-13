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

	public void gerarPontos() {// Gera as coordenadas dos pokemons colocando-os
							
		poke.gerarListaPoke();// na lista
		for (int i = 0; i < poke.pokedex.size(); i++) {

			Pokemon pk = new Pokemon();
			pk = poke.pokedex.get(i);
			
			Random randomR = new Random();
			int X = randomR.nextInt(180);

			double x = cordenadaX(X);
			pk.cordX = x;
			double y = cordenadaY(X);
			pk.cordY = y;
			double z = cordenadaZ(X,i);
			pk.cordZ = z;

			poke.pokedex.set(i,pk);
			
			verificaCoord(x, y, z, i);
			CompararPontos(i);

		}
	}

	public void CompararPontos(int i) {// Calcula a distância entre dois
		Pokemon pk2 = new Pokemon();	
		pk2 = poke.pokedex.get(i);// pokemóns
		for (int j = 0; j < poke.pokedex.size(); j++) {
			double valorDist = 0;
			double calcX = 0;
			double calcY = 0;
			double calcZ = 0;
			if (j == i) {
				j++;
			}
			if(j > 99){
				break;
			} 
			calcX = poke.pokedex.get(j).cordX + poke.pokedex.get(i).cordX;
			calcY = poke.pokedex.get(j).cordY + poke.pokedex.get(i).cordY;
			calcZ = poke.pokedex.get(j).cordZ + poke.pokedex.get(i).cordZ;
			valorDist = Math.sqrt(Math.pow(calcX, 2) + Math.pow(calcY, 2) + Math.pow(calcZ, 2)); // Aqui
			if (valorDist >= 5) {
				pk2.aceito = true;
				poke.pokedex.set(i,pk2);
				
			} else if (valorDist < 5) {
				pk2.aceito = false;
				poke.pokedex.set(i,pk2);
				
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
		Pokemon pk3 = new Pokemon();
		pk3 = poke.pokedex.get(pos);
		
		if (a < areaX && b < areaY && c < areaZ) {
			pk3.aceito = true;
			poke.pokedex.set(pos, pk3);
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

	public double cordenadaZ(int R,int i) {// gera a cordenadaZ //rever cordenadaZ
		
		double Z = 0;
		if(poke.pokedex.get(i).tipo == "voador"){
			System.out.println(R);
			Z = (Math.cos(R)) + 2;
			System.out.println(Z);
		}
		else{
			System.out.println(R);
			Z = Math.cos(R);
			System.out.println(Z);
		}
		
		return Z;
	}

}
