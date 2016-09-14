package trab;

import java.util.ArrayList;
import java.util.Random;

public class Ponto {

	protected int areaX = 10000;
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
			int X = randomR.nextInt(100);

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
			if (valorDist >= 5 && poke.pokedex.get(i).aceito == true) {
				pk2.aceito = true;
				poke.pokedex.set(i,pk2);
				
			} else if (valorDist < 5) {
				pk2.aceito = false;
				poke.pokedex.set(i,pk2);
				break;
				
			}
		}

	}

	public void mostrarLista() {// Sera mostrado a lista de pokemons que seram
								// dispostos na area
		int cont = 0;
		for (int i = 0; i < poke.pokedex.size(); i++) {
			if (poke.pokedex.get(i).aceito == true) {
				cont++;
				System.out.println("Numero: " + poke.pokedex.get(i).num);
				System.out.println("Nome: " + poke.pokedex.get(i).nome);
				System.out.println("Tipo: " + poke.pokedex.get(i).tipo);
				System.out.printf("cordX: %.2f %n" , poke.pokedex.get(i).cordX);
				System.out.printf("cordY: %.2f %n" , poke.pokedex.get(i).cordY);
				System.out.printf("cordZ: %.2f %n" , poke.pokedex.get(i).cordZ);
				System.out.println("---------------");
			}
			
		}
		System.out.println("Pokemons gerados: " + cont);
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
		X = Math.pow(R, 2);
		return X;
		
	}

	public double cordenadaY(int R) {// gera a cordenadaY
		
		double Y = 0;
		Y = Math.pow(2*R, 2)/3;
		return Y;
		
	}

	public double cordenadaZ(int R,int i) {// gera a cordenadaZ //rever cordenadaZ
		
		double Z = 0;
		if(poke.pokedex.get(i).tipo == "voador"){
			Z = (Math.log(R))+2;
		}
		else{
			System.out.println(R);
			Z = Math.log(R);
		}
		
		return Z;
	}

}
