package fila;

public class Aluno {

	private int RA;
	private String nome;
	private int CPF;
	
	public Aluno(){
		RA = 0;
		nome = "";
		CPF = 0;
	}

	public int getRA() {
		return RA;
	}

	public void setRA(int rA) {
		RA = rA;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	
	
}
