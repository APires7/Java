package contaBancaria;

public class List {

	public CC[] accounts;
	public int maxSize;
	public int last;
	public int error = -1;

	public List(int x) {
		accounts = new CC[x];
	}

	public boolean fullList() {
		if (last == maxSize)
			return true;
		return false;
	}

	boolean emptyList() {
		for (int i = 0; i < this.maxSize; i++) {
			if (accounts[i] != null)
				return false;
		}
		return true;
	}

	private int emptyPosition() {
		for (int i = 0; i < this.maxSize; i++) {
			if (accounts[i] == null)
				return i;
		}
		return error;
	}

	private int accountPosition(int accountNum) {
		for (int i = 0; i < this.maxSize; i++) {
			if (this.accounts[i] != null) {
				if (this.accounts[i].getAccountNumber() == accountNum)
					return i;
			}
		}
		return error;
	}

	public boolean addAccount(CC x) {
		accounts[last] = x;
		last++;
		return true;
	}

	public boolean removeAccount(int r) {
		for (int i = 0; i < last - 1; i++) {
			if (accounts[i].getAccount() == r) {
				accounts[i] = null;
				last--;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String returnS = "";
		for (int i = 0; i < this.last; i++) {
			returnS += accounts[i].send() + "\n";
			returnS += accounts[i].toString();
		}
		return returnS;
	}

	public String toString(int value) {
		return "Account: " + this.accounts[value].getAccountNumber() + " - Balance: " + accounts[value].getBalance();
	}

	public List concatenateList(List listX) {
		List concatenate;
		int size = listX.maxSize;
		int size2 = this.maxSize + size;
		int x = 0;
		concatenate = new List(size2);
		for (int i = 0; i < last; i++) {
			concatenate.accounts[x] = accounts[i];
			x++;
		}
		for (int j = 0; j < listX.last; j++) {
			concatenate.accounts[x] = listX.accounts[j];
		}
		return concatenate;
	}

	public List equalList(List listX) {
		List equal;
		int size = listX.maxSize;
		int size2 = this.maxSize + size;
		int x = 0;
		equal = new List(size2);
		for (int i = 0; i < last; i++) {
			for (int j = 0; j < listX.last; j++) {
				if (listX.accounts[j].getAccount() == accounts[i].getAccount()) {
					equal.accounts[x] = accounts[i];
					x++;
				}
			}
		}
		return equal;
	}

	public List differentList(List listX) {
		List different;
		int size = listX.maxSize;
		int size2 = listX.maxSize + size;
		int re = 0;
		int x = 0;
		different = new List(size);
		for (int i = 0; i < last; i++) {
			for (int j = 0; j < listX.last; j++) {
				if (accounts[i].getAccount() != listX.accounts[j].getAccount()) {
					re++;
				}
			}
			if (re == listX.last) {
				different.accounts[x] = accounts[i];
				x++;
				re = 0;
			}
		}
		for (int i = 0; i < listX.last; i++) {
			for (int j = 0; j < last; j++) {
				if (accounts[j].getAccount() != listX.accounts[i].getAccount()) {
					re++;
				}
			}
			if (re == last) {
				different.accounts[x] = listX.accounts[i];
				x++;
				re = 0;
			}
		}
		return different;
	}

}
