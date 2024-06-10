package groupProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateProfileTransaction {

	public String name;
	public String address;
	public Date birthDate;

	public void CreateProfile() {

		name = Read.read("name");
		address = Read.read("address");

		birthDate = null;
		try {
			birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(Read.read("birthDate"));
		} catch (ParseException ex) {
			ex.printStackTrace();
		}

		if (name == null || address == null || birthDate == null)
			System.err.println("Error create profile transaction"); // error message here

		else {
			BankClientProfile bankClientProfile = new BankClientProfile(name, address, birthDate);
		}
	}
}
