package pilha;

public class Main {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		pilha.insereNaPilha(3);
		pilha.insereNaPilha(5);
		pilha.insereNaPilha(1);
		pilha.removeNaPilha();
		pilha.insereNaPilha(8);
		pilha.insereNaPilha(2);
		pilha.insereNaPilha(1);
		pilha.removeNaPilha();
		pilha.imprimePilha();
	}
}
