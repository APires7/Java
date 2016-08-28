package trabOrdenacao;

public class LES {

	protected int maxSize;
	protected int last;
	BankAccount[] bc;

	public LES() {
		last = 0;
		maxSize = 200;
		bc = new BankAccount[200];
	}

	public LES(int maxSize) {
		this.maxSize = maxSize;
		bc = new BankAccount[maxSize];
	}
	
	public void add(BankAccount bc) {
		if (!isFull()) {
			this.bc[last] = bc;
			this.last++;
		}
	}

	public boolean remove(int number) {
		for (int i = 0; i < last; i++) {
			if (this.bc[i].getAccountNumber() == number) {
				for (int j = i; j < last; j++) {
					this.bc[j] = this.bc[j + 1];
				}
				this.bc[last - 1] = null;
				last--;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String return1 = "";
		for (int i = 0; i < last; i++) {
			return1 += "Account: " + bc[i].getAccount() + " Balance: " + bc[i].getBalance() + "\n";
		}
		return return1;
	}

	public BankAccount getAccount(int pos) {
		if (pos < last && !isEmpty()) {
			return bc[pos];
		}
		return null;
	}

	public int size() {
		return this.last;
	}

	public boolean isEmpty() {
		if (last == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (last == maxSize) {
			return true;
		}
		return false;
	}

	public LES concatenateList(LES l) {
		int sizeList = this.last = 1 + l.size();
		LES auxList = new LES(sizeList);
		for (int i = 0; i < l.size(); i++) {
			auxList.add(l.getAccount(i));
		}
		for (int i = 0; i < last; i++) {
			for (int j = 0; j < auxList.size(); j++) {
				if (auxList.getAccount(j).equals(l.getAccount(i))) {
					break;
				} else if (j == auxList.size() - 1) {
					auxList.add(l.getAccount(i));
				}
			}
		}
		return auxList;
	}

	public LES equalList(LES l) {
		int x = Math.max(l.size(), last);
		LES auxList = new LES(x);
		for (int i = 0; i < x; i++) {
			int result = 0;
			for (int j = 0; j < last; j++) {
				if (this.bc[j].equals(l.getAccount(i))) {
					auxList.add(l.getAccount(i));
				}
			}
		}
		return auxList;
	}

	public LES differentList(LES l) {
		int x = Math.max(l.size(), last);
		LES auxList = new LES(this.last - 1 + l.size());
		for (int i = 0; i < x; i++) {
			int result = 0;
			for (int j = 0; j < last; j++) {
				if (this.bc[j].equals(l.getAccount(i))) {
					result++;
				}
			}
			if (result == 0) {
				auxList.add(l.getAccount(i));
			}
		}
		return auxList;
	}

	public LES bubbleSort(LES l) {
		BankAccount aux = new BankAccount();
		for (int i = 0; i < this.last; i++) {
			for (int j = 0; j < this.last - 1; j++) {
				if (l.bc[j].getAccount() > l.bc[j + 1].getAccount()) {
					aux = l.bc[j];
					l.bc[j] = l.bc[j + 1];
					l.bc[j + 1] = aux;
				}
			}

		}
		return l;
	}

	public LES insertionSort(LES l) {
		BankAccount aux = new BankAccount();
		for (int i = 0; i < this.last; i++) {
			for (int j = 1; j < this.last; j++) {
				if (l.bc[j].getAccount() < l.bc[j - 1].getAccount()) {
					aux = l.bc[j];
					l.bc[j] = l.bc[j - 1];
					l.bc[j - 1] = aux;
				}
			}
		}
		return l;
	}

	public void quickSort(LES l, int low, int high) {
		if (l == null || l.bc.length == 0) {
			return;
		}

		if (low >= high) {
			return;
		}
		int middle = low + (high - low) / 2;
		int pivot = l.bc[middle].getAccount();
		int i = low;
		int j = high;
		while (i <= j) {
			while (l.bc[i].getAccount() < pivot) {
				i++;
			}
			while (l.bc[j].getAccount() > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = l.bc[i].getAccount();
				this.bc[i].account = this.bc[j].account;
				l.bc[j].account = temp;
				i++;
				j--;
			}
		}
		if (low < j){
			quickSort(l, low, j);
		}
		if (high > i){
			quickSort(l, i, high);
		}			
	}
	
	public void mergeSort(LES l) {
		LES aux = new LES();
		mergeSort(l, aux, 0, l.bc.length - 1);
	}

	private void mergeSort(LES l, LES auxList, int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;
			mergeSort(l, auxList, low, middle);
			mergeSort(l, auxList, middle + 1, high);
			merge(l, auxList, low, middle + 1, high);
		}
	}

	private void merge(LES l, LES auxList, int left, int right, int rightEnd) {
		int leftEnd = right - 1;
		int k = left;
		int num = rightEnd - left + 1;
		while (left <= leftEnd && right <= rightEnd) {
			if (l.bc[left].compareTo(l.bc[right]) <= 0) {
				auxList.bc[k++] = l.bc[left++];
			} else {
				auxList.bc[k++] = l.bc[right++];
			}
		}
		while (left <= leftEnd) {
			auxList.bc[k++] = l.bc[left++];
		}
		while (right <= rightEnd) {
			auxList.bc[k++] = l.bc[right++];
		}
		for (int i = 0; i < num; i++, rightEnd--) {
			l.bc[rightEnd] = auxList.bc[rightEnd];
		}
	}

}
