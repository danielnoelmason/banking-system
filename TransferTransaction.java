package groupProject;

import java.util.List;

public class TransferTransaction {

	public List<Integer> accountNumbers;
	public List<String> accountTypes;
	public List<Boolean> accountVerified;
	public List<Double> accountBalances;

	public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {

		int from = 0;

		for (from = 0; from < accountNumbers.size(); ++from) {

			if (accountNumbers.get(from) == fromAccountNumber) {

				System.out.println("\tFrom accountNumber: " + accountNumbers.get(from));
				System.out.println("\ttFrom accountType: " + accountTypes.get(from));
				System.out.println("\ttFrom accountVerified: " + accountVerified.get(from));
				System.out.println("\ttFrom accountBalance: " + accountBalances.get(from));
			}
		}

		int to = 0;

		for (to = 0; to < accountNumbers.size(); ++to) {

			if (accountNumbers.get(to) == toAccountNumber) {

				System.out.println("\tTo accountNumber: " + accountNumbers.get(to));
				System.out.println("\tTo accountType: " + accountTypes.get(to));
				System.out.println("\tTo accountVerified: " + accountVerified.get(to));
				System.out.println("\tTo accountBalance: " + accountBalances.get(to));
			}
		}

		if (from >= 0 && from < accountNumbers.size() && to >= 0 && to < accountNumbers.size()
				&& accountBalances.get(from) >= amount) {

			accountBalances.set(from, accountBalances.get(from) - amount);

			accountBalances.set(to, accountBalances.get(to) + amount);

			System.out.println("Transfer is completed");
		}

		else
			System.out.println("Transfer cannot be made");
	}
}
