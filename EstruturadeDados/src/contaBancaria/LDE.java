package contaBancaria;

public class LDE {

	public CCLDE first;
	public CCLDE last;

	public LDE() {
		this.first = null;
		this.last = null;
	}

	public void add(CCLDE list) {
		if (emptyList()) {
			this.first = list;
		} else {
			CCLDE aux;
			aux = first;
			while (true) {
				if (aux.getNext() == null) {
					aux.setNext(list);
					break;
				}
				aux = aux.getNext();
			}
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

	public LDE concatenateList(LDE listX) {
		LDE listY = new LDE();
		CCLDE aux = this.first;
		while (true) {
			if (aux.getNext() != null) {
				listY.add(aux);
				aux = aux.getNext();
			} else
				break;
		}
		aux = listX.first;
		while (true) {
			if (aux.getNext() != null) {
				listY.add(aux);
				aux = aux.getNext();
			} else
				break;
		}
		return listY;
	}

	public LDE equalsList(LDE listX) {
		LDE listY = new LDE();
		CCLDE aux = this.first;
		CCLDE aux2 = listX.first;
		for (int i = 0; i < quantity(); i++) {
			for (int j = 0; j < listX.quantity(); j++) {
				if (aux.getAccount() == aux2.getAccount()) {
					// aux.getBalance() += aux2.setBalance();
					listY.add(aux);
				}
				aux2 = aux2.getNext();
			}
			aux2 = listX.first;
			aux = aux.getNext();
		}
		return listY;
	}

	public LDE differentList(LDE listX) {
		LDE listY = new LDE();
		CCLDE aux = this.first;
		CCLDE aux2 = listY.first;
		int k = 0;
		for (int i = 0; i < quantity(); i++) {
			for (int j = 0; j < listX.quantity(); j++) {
				if (aux.getAccount() != aux2.getAccount()) {
					k++;
				}
				aux2 = aux2.getNext();
			}
			if (k == listX.quantity())
				listY.add(aux);
			k = 0;
			aux2 = listX.first;
			aux = aux.getNext();
		}
		aux = this.first;
		aux2 = listX.first;
		k = 0;
		for (int i = 0; i < listX.quantity(); i++) {
			for (int j = 0; j < quantity(); j++) {
				if (aux2.getAccount() != aux.getAccount()) {
					k++;
				}
				aux = aux.getNext();
			}
			if (k == quantity())
				listX.add(aux2);
			k = 0;
			aux = this.first;
			aux2 = aux2.getNext();
		}
		return listY;
	}
}
