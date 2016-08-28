package trabED;

import contaBancaria.CCLDE;

public class LDE {

	private static class No {
		BankAccount item;
		No next;
		No previous;
	}

	private No first;
	private No last;

	public LDE() {
		this.first = new No();
		this.last = this.first;
		this.first.next = null;
		this.first.previous = null;
	}

	public void insertFirstPos(BankAccount x) {
		No aux = this.first.next;
		this.first.next = new No();
		this.first.next.item = x;
		this.first.next.next = aux;
		this.first.next.previous = null;
		aux.previous = this.first.next;
	}
	
	@Override
	public String toString() {
		String x = new String();	
		return x;		
	}
	
	

}
