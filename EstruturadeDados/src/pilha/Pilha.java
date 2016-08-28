package pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	private List<Integer> numeros = new LinkedList<Integer>();
	
	public void insereNaPilha(int n) {
		if (pilhaVazia())
			System.out.println("A pilha está vazia");
		this.numeros.add(n);		
	}

	public Integer removeNaPilha() {
		if (pilhaVazia())
			System.out.println("A pilha está vazia");
		return this.numeros.remove(this.numeros.size() - 1);		
	}

	public boolean pilhaVazia() {
		return this.numeros.size() == 0;
	}
	
	public void imprimePilha() {
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
	}

}
