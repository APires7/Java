package trab;

import java.util.Random;
import java.lang.Math;

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
	
	Pokemon poke = new Pokemon();
	
	List<Pokemon> pokem = poke.geraListaPoke();
	
	public void gerarPontos() {//gera as coordenadas dos pokemons colocando-os na lista
		for (int i = 0; i < pokem.size(); i++) {
	
                        int R = geraR();
                        
                        int x = cordenadaX(R);
			pokem[i].add(cordX = x);


                        int y = cordenadaY(R);
			pokem[i].add(cordY = y);
			
			int z = cordenadaZ(R)
			pokem[i].add(cordZ = z);
			
			
			verificaCoord(x, y, z, i);
			CompararPontos();
		} 
	}
	
	public void CompararPontos(){//É calculado a distancia entre dois pokemos
	}
	
	public void mostrarLista(){//Sera mostrado a lista de pokemons que seram dispostos na area
	
                    for (int i = 0; i < pokem.size(); i++) {
                        if(pokem.aceito == true){
			System.out.println("Numero: "pokem[i].num);
			System.out.println("Nome: " pokem[i].nome);
			System.out.println("Tipo: "pokem[i].tipo);
                        System.out.println("cordX: " + pokem[i].cordX);
			System.out.println("cordY: " + pokem[i].cordY);
                        System.out.println("cordZ:" + pokem[i].cordZ);
			System.out.println("---------------");
			}
                    }
	}

	void verificaCoord(int a, int b, int c, int pos) {
		if (a < areaX && b < areaY && c < areaZ) {
			pokem[pos].aceito = true;
		}
	}
	
	public int geraR(){
            Random randomR = new Random();
            int valorX = randomR.nextInt(5000);
            int funcao = ((valorX)/2)*pow(3,2);
            
            return funcao;
	}

        public int cordenadaX(int R){
            
        }
        
        public int cordenadaY(int R){
        }
        
        public int cordenadaZ(int R){
        }
}
