package contaBancaria;

public class FIFO extends List {

	public FIFO(int x) {
		super(x);
	}

	public boolean addFile(CC x) {
		if (!fullList()) {
			accounts[last] = x;
			last++;
			return true;
		}
		return false;
	}

	public boolean removeFile() {
		if (!emptyList()) {
			CC re;
			re = accounts[0];
			for (int i = 0; i < maxSize - 1; i++) {
				accounts[i] = accounts[i + 1];
			}
			maxSize--;
			return true;
		}
		return false;
	}

}
