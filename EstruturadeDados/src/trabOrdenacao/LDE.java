package trabOrdenacao;

import trabOrdenacao.CCLDE;

public class LDE {
	protected CCLDE first;
	protected CCLDE last;
	BankAccount[] bc;

	public LDE() {
		this.first = null;
		this.last = null;
	}

	public void add(CCLDE bc) {
		if (first == null) {
			first = last = bc;
		} else {
			last.next = bc;
			last = bc;
		}
	}

	public CCLDE remove(int end) {
		CCLDE aux = this.first;
		CCLDE aux2 = this.first;
		CCLDE re = new CCLDE();
		for (int i = 0; i < end; i++) {
			aux = aux.getNext();
		}
		for (int i = 0; i < end - 1; i++) {
			aux2 = aux2.getNext();
		}
		if (aux != null) {
			re = aux;
		}
		if (end == quantity() - 1) {
			System.out.println("ERROR");
			System.out.println(aux2.toString());
			aux2.setNext(null);
		} else if (end == 0) {
			this.first = aux.getNext();
		} else {
			aux2.setNext(aux.getNext());
			System.out.println("OK");
		}
		return re;
	}

	@Override
	public String toString() {
		String x = new String();
		CCLDE aux = first;
		while (true) {
			if (aux == null)
				break;
			else {
				x += "Account number: " + aux.getAccountNumber() + "\n";
				x += "Balance: " + aux.getBalance();
				aux = aux.getNext();
			}
		}
		return x;
	}

	public boolean emptyList() {
		if (this.first == null) {
			return true;
		}
		return false;
	}

	public int quantity() {
		int i = 0;
		CCLDE aux = this.first;
		while (true) {
			if (aux != null) {
				aux = aux.getNext();
				i++;
			} else
				break;
		}
		return i;
	}

	public CCLDE position(int x) {
		CCLDE aux = this.first;
		for (int i = 1; i <= x; i++) {
			aux = aux.getNext();
		}
		return aux;
	}

	public void bubbleSort() {
		for (int i = 0; i < quantity() - 1; i++) {
			for (int j = 0; j < quantity(); j++) {
				CCLDE account = position(j);
				if (account.getNext() != null) {
					if (account.getNext().account < account.account) {
						CCLDE next = account.getNext();
						CCLDE aux = next.getNext();
						account.setNext(aux);
						if (j > 0) {
							position(j - 1).setNext(next);
						} else {
							this.first = next;
						}
					}
				}
			}
		}
	}
	
	public void insertionSort(){
		
	}

}
