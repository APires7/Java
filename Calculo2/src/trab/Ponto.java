package trab;

import java.util.Random;

public class Ponto {

	protected int areaX = 13000;
	protected int areaY = 13000;
	protected int areaZ = 4;

	static int x;
	static int y;
	static int z;

	public Ponto() {
		x = 0;
		y = 0;
		z = 0;
	}

	public Ponto(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

	public void gerarPonto(int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			//System.out.println("P" + i);

			Random randomX = new Random();
			int eixoX = randomX.nextInt(areaX);
			//System.out.println("X:" + eixoX);

			Random randomY = new Random();
			int eixoY = randomX.nextInt(areaY);
			//System.out.println("Y:" + eixoY);

			Random randomZ = new Random();
			int eixoZ = randomX.nextInt(areaZ);
			//System.out.println("Z:" + eixoZ);
			//System.out.println("---------------");

			verificaCoord(eixoX, eixoY, eixoZ);
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
