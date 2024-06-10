package groupProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChangeBankClientDetailsTransaction {

	public void changeBankClientDetails() {

		String name = Read.read("new name");
		String address = Read.read("new address");

		Date birthDate = null;
		try {
			birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(Read.read("new birthDate"));
		} catch (ParseException ex) {
			ex.printStackTrace();
		}

		String username = Read.read("new username");
		String password = Read.read("new password");

		ClientDetails clientDetails = new ClientDetails(name, address, birthDate, username, password);
	}
}