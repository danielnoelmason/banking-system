package groupProject;

import java.util.ArrayList;
import java.util.List;

public class RegistrationTransaction {

	List<BankClient> bankClients = new ArrayList<>();

	public String username;
	public String password;

	public void addBankClient() {

		username = Read.read("username");
		password = Read.read("password");

		if (username == null || username == null)
			System.err.println("Error register transaction");

		BankClient bankClient = new BankClient(username, password);

		bankClients.add(bankClient);
	}
}
