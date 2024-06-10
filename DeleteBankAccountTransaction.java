import java.util.List;

public class DeleteBankAccountTransaction {

	public List<Integer> accountNumbers;
	List<BankClient> accountTypes;
	List<BankClient> accountVerified;
	List<Integer> accountBalances;

	public void deleteBankAccountTransaction(List<BankClient> bankClients) {
		int accountNumber = 1;
		bankClients.get(pos).printAccounts();

		accountNumber = Integer.parseInt(Read.read("account number"));

		bankClients.get(pos).deleteAccount(accountNumber);

		if (bankClients.get(pos).accountNumbers.size() == 0)
			bankClients.remove(pos);

	}

	public void deleteAccount(int accountNumber) {

		for (pos = 0; pos < BankaccountNumbers.size(); ++pos)
			if (accountNumbers.get(pos) == accountNumber)
				break;

		if (pos >= 0 && pos < accountNumbers.size()) {

			accountNumbers.remove(pos);
			accountTypes.remove(pos);
			accountVerified.remove(pos);
			accountBalances.remove(pos);
		}
	}
}
