package trab;

import java.util.Random;

public class Ponto {

	protected int areaX = 13000;
	protected int areaY = 13000;
	protected int areaZ = 4;

	static double x;
	static double y;
	static double z;

	public Ponto() {
		x = 0.0;
		y = 0.0;
		z = 0.0;
	}

	public Ponto(double a, double b, double c) {
		x = a;
		y = b;
		z = c;
	}
	
        public int gerarQuantPokemon() { //gera a quantidade de pokemons que iram aparecer na area
		Random random = new Random();
		int min = 50;
		int quantidade = random.nextInt(min) + min;
		// System.out.println(quantidade);
		return quantidade;
	}
	
	Pokemon poke = new Pokemon();
	
	List<Pokemon> pokem = poke.geraListaPoke();
	
	public void gerarPonto(int quantidade) {//gera as coordenadas dos pokemons colocando-os na lista
		for (int i = 0; i < quantidade; i++) {
	
			Random randomX = new Random();
			int eixoX = randomX.nextInt(13000);
			pokem[i].add(cordX = eixoX);


			Random randomY = new Random();
			int eixoY = randomX.nextInt(13000);
			pokem[i].add(cordY = eixoY);
			
			Random randomZ = new Random();
			int eixoZ = randomX.nextInt(4);
			pokem[i].add(cordZ = eixoZ);
			
			
			verificaCoord(eixoX, eixoY, eixoZ);
			CompararPontos();
		}
	}
	
	public void CompararPontos(){//É calculado a distancia entre dois pokemos
	}
	
	public void mostrarLista(){//Sera mostrado a lista de pokemons que seram dispostos na area
	
                    for (int i = 0; i < quantidade; i++) {
			System.out.println("Numero: "pokem[i].num);
			System.out.println("Nome: " pokem[i].nome);
			System.out.println("Tipo: "pokem[i].tipo);
                        System.out.println("cordX: " + pokem[i].cordX);
			System.out.println("cordY: " + pokem[i].cordY);
                        System.out.println("cordZ:" + pokem[i].cordZ);
			System.out.println("---------------");
			
                    }
	}

	void verificaCoord(int a, int b, int c) {
		if (a > areaX) {
			System.out.println("X excede o espaço");
		}
		if (b > areaY) {
			System.out.println("Y excede o espaço");
		}
		if (c > areaZ) {
			System.out.println("Z excede o espaço.");
		}
	}

}
