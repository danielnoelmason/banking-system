package groupProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankClientUI { // this is all very broken

	public static void main(String[] args) throws ParseException {

		List<BankClient> bankClients = new ArrayList<>();

		String adminName = "X", employeeName = "Y";

		while (true) {

			BankClient.print(bankClients);

			System.out.println("\n0. Exit");
			System.out.println("1. Register"); // --> Create Profile --> Create Account --> Create Further Accounts
			System.out.println("2. Login");
			String choice = Read.read("choice");

			if (choice.equals("0"))
				break;

			else if (choice.equals("1")) {

				RegistrationTransaction registrationTransaction = new RegistrationTransaction();
				registrationTransaction.addBankClient();

				CreateProfileTransaction createProfileTransaction = new CreateProfileTransaction();
				createProfileTransaction.CreateProfile();

				while (true) {

					CreateBankAccountTransaction createBankAccountTransaction = new CreateBankAccountTransaction();

					int accountNumber = createBankAccountTransaction.addAccount(accountType, accountNumber);

					boolean verified = createBankAccountTransaction.askForVerification();

					createBankAccountTransaction.verify(accountNumber, verified);

					System.out.println("\n0. NO extra account");
					System.out.println("1. Extra account");
					String choice2 = Read.read("choice");

					if (choice2.equals("0"))
						break;
				}
			}

			else if (choice.equals("2")) {

				LoginTransaction loginTransaction = new LoginTransaction();

				int pos = loginTransaction.login(bankClients);

				if (pos > 0) {

					System.out.println("\n0. Exit");
					System.out.println("5. Change Bank Client Details");
					System.out.println("6. Delete Bank Account");
					System.out.println("7. Money transfer");
					System.out.println("8. Book Appoinment");
					choice = Read.read("choice");

					if (choice.equals("5")) {

						ChangeBankClientDetailsTransaction changeBankClientDetailsTransaction = new ChangeBankClientDetailsTransaction();

						changeBankClientDetailsTransaction.changeBankClientDetails();

					}

					else if (choice.equals("6")) {
						DeleteBankAccountTransaction DeleteBankAccountTransaction = new DeleteBankAccountTransaction();
						DeleteBankAccountTransaction.deleteBankAccountTransaction(bankClients);

					}

					else if (choice.equals("7")) {

						TransferTransaction transferTransaction = new TransferTransaction();
						transferTransaction.transfer(fromAccountNumber, toAccountNumber, amount);
					}

					else if (choice.equals("8")) {

						Date appointmentDate = null;

						BookAppointmentTransaction bookAppointmentTransaction = new BookAppointmentTransaction();
						boolean scheduled = bookAppointmentTransaction.askForSchedulingAppointment(
								bankClients.get(pos).clientID, appointmentDate, employeeName);

						if (scheduled)
							bookAppointmentTransaction.bookAppointment(appointmentDate, employeeName);

						else
							System.err.println("The appointment has not been booked");
					}
				}
			}
		}
	}
}
