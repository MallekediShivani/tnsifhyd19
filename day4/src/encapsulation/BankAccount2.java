package encapsulation;

public class BankAccount2 {
			private String accountHolderName="Ravi";
			private double balance=1707.27;
			private String accountNumber="AR15B19705";
			
		public String getAccountHolderName() {
				return accountHolderName;
			}


			public void setAccountHolderName(String accountHolderName) {
				this.accountHolderName = accountHolderName;
			}


			public double getBalance() {
				return balance;
			}


			public void setBalance(double balance) {
				this.balance = balance;
			}


			public String getAccountNumber() {
				return accountNumber;
			}


			public void setAccountNumber(String accountNumber) {
				this.accountNumber = accountNumber;
			}
	public static void main(String[] args) {
		BankAccount2 obj=new BankAccount2();
		System.out.println(obj.accountHolderName);
		System.out.println(obj.balance);
		System.out.println(obj.accountNumber);
	}
			

}
