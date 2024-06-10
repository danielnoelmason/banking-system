package groupProject;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BankClient extends Person {

	public static final AtomicInteger clientCount = new AtomicInteger(0);

	public int clientID;

	public String username;
	public String password;

	public Date birthDate;

	public List<Integer> accountNumbers;
	public List<String> accountTypes;
	public List<Boolean> accountVerified;
	public List<Double> accountBalances;

	public BankClient(String username, String password) {

		this.username = username;
		this.password = password;
		this.clientID = clientCount.incrementAndGet();
	}

	public void toPrint() {

		System.out.println("clientID = " + clientID);
		if (name != null)
			System.out.println("name = " + name);
		if (address != null)
			System.out.println("address = " + address);
		if (address != null)
			System.out.println("birthDate = " + birthDate);

		for (int i = 0; accountNumbers != null && i < accountNumbers.size(); ++i)
			System.out.println("\taccountNumber: " + accountNumbers.get(i));
	}

	public void toPrintAccount(int accountNumber) {

		for (int i = 0; accountNumbers != null && i < accountNumbers.size(); ++i) {

			if (accountNumbers.get(i) == accountNumber) {

				System.out.println("\taccountNumber: " + accountNumbers.get(i));
				System.out.println("\taccountType: " + accountTypes.get(i));
				System.out.println("\taccountVerified: " + accountVerified.get(i));
				System.out.println("\taccountBalance: " + accountBalances.get(i));
			}
		}
	}

	public void printAccounts() {

		for (int i = 0; accountNumbers != null && i < accountNumbers.size(); ++i) {

			System.out.println("\taccountNumber: " + accountNumbers.get(i));
			System.out.println("\taccountType: " + accountTypes.get(i));
			System.out.println("\taccountVerified: " + accountVerified.get(i));
			System.out.println("\taccountBalance: " + accountBalances.get(i));
		}
	}

	public static void print(List<BankClient> bankClients) {

		System.out.println("Bank Clients:\n");

		for (int i = 0; bankClients != null && i < bankClients.size(); ++i)
			bankClients.get(i).toPrint();
	}
}