package trabOrdenacao;

public class BankAccount {

	int account;
	double balance;
	
	public BankAccount() {
	}

	public BankAccount(int account, double value) {
		this.balance = value;
		this.account = account;
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public void cashOut(double value) {
		this.balance -= value;
	}

	public int getAccountNumber() {
		return this.account;
	}

	public double getBalance() {
		return this.balance;
	}

	@Override
	public String toString() {
		return "Balance: " + getBalance();
	}

	public String send() {
		return "Account number: " + Integer.toString(account);
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	int compareTo(BankAccount bc) {
        if(bc.account == account){
        	return 0;
        }
        else if (bc.account < account){
        	return -1;
        }
        else { 
        	return 1;
        }
        
    }

}
