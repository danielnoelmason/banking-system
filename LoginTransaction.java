package groupProject;

import java.util.List;

public class LoginTransaction {

	public boolean successfulLogin = false;
	public int pos = 0;

	public int login(List<BankClient> bankClients) {

		String username = Read.read("username");
		String password = Read.read("password");

		int pos = 0;

		for (pos = 0; pos < bankClients.size(); ++pos)

			if (bankClients.get(pos).username.equals(username) && bankClients.get(pos).password.equals(password))
				break;

		if (pos < 0 || pos >= bankClients.size()) {

			System.err.println("Invalid username or password");
			pos = -1;

		} else {

			bankClients.get(pos).toPrint();

			int accountNumber = Integer.parseInt(Read.read("account number"));

			bankClients.get(pos).toPrintAccount(accountNumber);

		}

		return pos;

	}
}
