package fila;

public class Main {

	public static void main(String[] args) {
	    Fila fila = new Fila();

	    Aluno aluno = new Aluno();
	    fila.insere(aluno);
	    Aluno aluno2 = new Aluno();
	    fila.insere(aluno2);
	    
	    Aluno alunoRemovido = fila.remove();
	
	    if (fila.vazia()) {
	      System.out.println("A fila está vazia");
	    }
	  }
}
