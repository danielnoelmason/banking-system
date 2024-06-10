package groupProject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CreateBankAccountTransaction {

	public static final AtomicInteger accountCount = new AtomicInteger(0);

	public List<Integer> accountNumbers;
	public List<String> accountTypes;
	public List<Boolean> accountVerified;
	public List<Double> accountBalances;

	public int addAccount(String accountType, int accountNumber) {

		if (accountType == null
				|| (accountType != null && !accountType.equals("primary") && !accountType.equals("savings"))) {

			System.err.println("Error create account transaction");

			return -1;
		}

		else {

			if (accountNumbers == null)
				accountNumbers = new ArrayList<Integer>();
			if (accountTypes == null)
				accountTypes = new ArrayList<String>();
			if (accountVerified == null)
				accountVerified = new ArrayList<Boolean>();
			if (accountBalances == null)
				accountBalances = new ArrayList<Double>();

			accountNumbers.add(accountCount.incrementAndGet());
			accountTypes.add(accountType);
			accountVerified.add(false);
			accountBalances.add(0.0);

			if (accountType.contains("savings")) {
				BankAccount bankAccount = new SavingsAccount(accountNumber, accountType); // example of Polymorphism

			} else if (accountType.contains("primary")) {
				BankAccount bankAccount = new PrimaryAccount(accountNumber, accountType); //// example of Polymorphism
			}

			return accountCount.get();

		}
	}

	public boolean askForVerification() {

		// Assume we sent a message to bank admin

		return true;
	}

	public void verify(int accountNumber, boolean verified) {

		for (int i = 0; i < accountNumbers.size(); ++i)
			if (accountNumbers.get(i) == accountNumber)
				accountVerified.set(i, verified);
	}
}
