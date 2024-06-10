package groupProject;

public abstract class BankAccount {

	public int accountNumber;
	public String accountType;
	public double accountBalance;
	public boolean isVerified;

	public BankAccount(int accountNumber, String accountType) {

		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = 0.0;
		this.isVerified = false;
	}
}
