package trab;

import java.util.ArrayList;
import java.util.Random;

public class Ponto {

	private int x;
	private int y;
	private int z;
	
	private static ArrayList<Ponto> pontos = new ArrayList<>();
	private static final int ladoX = 13000;
	private static final int ladoY = 13000;
	private static final int ladoZ = 4;

	public Ponto(){
		x = 0;
		y = 0;
		z = 0;
	}
	
	public static Ponto gerarPonto() {
		Ponto ponto = new Ponto();
		Random random = new Random();
		ponto.setX(random.nextInt(ladoX));
		ponto.setY(random.nextInt(ladoY));
		ponto.setZ(random.nextInt(ladoZ));
		while (perto(ponto)) {
			ponto.setX(random.nextInt(ladoX));
			ponto.setY(random.nextInt(ladoY));
			ponto.setZ(random.nextInt(ladoZ));
		}
		return ponto;
	}

	public static boolean perto(Ponto a) {
		for (Ponto b : pontos) {
			if (Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)
					+ Math.pow(a.getZ() - b.getZ(), 2)) <= 5) {
				return true;
			}
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
	
	
	

}
