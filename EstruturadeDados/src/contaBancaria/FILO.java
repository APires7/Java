package contaBancaria;

public class FILO extends List {

	public FILO(int x) {
		super(x);
	}

	public boolean addStack(CC x) {
		if (!fullList()) {
			accounts[last] = x;
			last++;
			return true;
		}
		return false;
	}

	public boolean removeStack() {
		if (!emptyList()) {
			CC re;
			re = accounts[maxSize - 1];
			maxSize--;
			return true;
		}
		return false;
	}

}
