package contaBancaria;

public class CCLDE extends CC {

	private CCLDE next;

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
