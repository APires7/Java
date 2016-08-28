package contaBancaria;

public class LESO extends List {

	public LESO(int x) {
		super(x);
	}

	public int findAdd(CC x) {
		int account = x.getAccountNumber();
		int a = 0;
		while (a < this.last && this.accounts[a].getAccountNumber() < account)
			a++;
		return a;
	}

	@Override
	public boolean addAccount(CC x) {
		if (!emptyList()) {
			int end = this.findAdd(x);
			for (int i = this.last; i > end; i--) {
				this.accounts[i] = this.accounts[i - 1];
			}
			this.accounts[end] = x;
			this.last++;
			return true;
		}
		return false;
	}

	public int binarySearch(CC x) {
		int start = 0;
		int half = 0;
		int end = this.last - 1;
		while (start <= end) {
			half = (start + end) / 2;
			if (this.accounts[half].getAccount() < x.getAccount())
				return half;
			else {
				if (this.accounts[half].getAccount() < x.getAccount())
					return half;
				else {
					if (this.accounts[half].getAccount() > x.getAccount())
						end = half - 1;
				}
			}
		}
		if (end > 0) {
			if (this.accounts[half].getAccountNumber() < x.getAccountNumber())
				half++;
		}
		return half;
	}

	public LESO concatenateList(LESO lesX) {
		int size = lesX.maxSize + this.maxSize;
		LESO aux = new LESO(size);
		CC aux2 = new CC();
		for (int i = 0; i < last - 1; i++) {
			aux2 = accounts[i];
			aux.addAccount(aux2);
		}
		for (int i = 0; i < last - 1; i++) {
			aux2 = lesX.accounts[i];
			aux.addAccount(aux2);
		}
		return aux;
	}

	public LESO equalsList(LESO lesX) {
		int size = lesX.maxSize + this.maxSize;
		LESO aux = new LESO(size);
		CC aux2 = new CC();
		for (int i = 0; i < last - 1; i++) {
			for (int j = 0; j < lesX.last - 1; j++) {
				if (accounts[i].getAccount() <= lesX.accounts[i].getAccount()) {
					aux2 = accounts[j];
					aux.addAccount(aux2);
				} else
					break;
			}
		}
		return aux;
	}

	public LESO differentList(LESO lesX) {
		int size = lesX.maxSize + this.maxSize;
		LESO aux = new LESO(size);
		CC aux2 = new CC();
		int t = 0, p = 0;
		for (int i = 0; i < last - 1; i++) {
			for (int j = 0; j < lesX.last - 1; j++) {
				if (accounts[i].getAccount() <= lesX.accounts[j].getAccount()) {
					if (accounts[i].getAccount() != lesX.accounts[j].getAccount()) {
						t++;
						p = j;
					}
				} else
					break;
			}
			if (t == p) {
				aux2 = accounts[i];
				aux.addAccount(aux2);
			}
		}
		for (int i = 0; i < lesX.last - 1; i++) {
			for (int j = 0; j < lesX.last - 1; j++) {
				if (lesX.accounts[i].getAccount() <= accounts[j].getAccount()) {
					if (lesX.accounts[i].getAccount() != accounts[j].getAccount()) {
						t++;
						p = j;
					}
				} else
					break;
			}
			if (t == p) {
				aux2 = lesX.accounts[i];
				aux.addAccount(aux2);
			}
		}
		return aux;
	}

}
