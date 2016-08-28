package trabOrdenacao;

public class CCLDE extends BankAccount {

	CCLDE next = null;

	public CCLDE(int account, double value) {
		super(account, value);
	}

	public CCLDE() {
		super();
		this.next = null;
	}

	public void setNext(CCLDE next) {
		this.next = next;
	}

	public CCLDE getNext() {
		return this.next;
	}

}
