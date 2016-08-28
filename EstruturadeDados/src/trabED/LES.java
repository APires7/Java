package trabED;

public class LES {

	private static class No {
		BankAccount item;
		No next;
	}

	private No first;
	private No last;

	public LES() {
		this.first = new No();
		this.last = this.first;
		this.first.next = null;
	}

	public void insertFirstPos(BankAccount x) {
		No aux = this.first.next;
		this.first.next = new No();
		this.first.next.item = x;
		this.first.next.next = aux;
	}
	
	public BankAccount takeFirst() throws Exception{
	       if(this.empty()){
	           throw new Exception("Error: The list is empty.");
	       }
	       No aux = this.first.next;
	       this.first.next = aux.next;
	       return aux.item;
	   }
	   
	   public boolean empty () { 
	       return (this.first == this.last);
	   }
}
