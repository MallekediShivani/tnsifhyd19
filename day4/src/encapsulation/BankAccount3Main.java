package encapsulation;

public class BankAccount3Main {
		public static void main(String[] args) {
			BankAccount3 a1 = new BankAccount3();
			a1.setAccountHolderName("Suresh");
			a1.setBalance(2000.05);
		    a1.setAccountNumber("A10X85124");
		
	    	System.out.println(a1.getAccountHolderName());
			System.out.println(a1.getBalance());
			System.out.println(a1.getAccountNumber());

		}
}


