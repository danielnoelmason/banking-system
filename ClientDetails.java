package groupProject;

import java.util.Date;

public class ClientDetails {

	public int clientID;

	public String username;
	public String password;

	public String name;
	public String address;
	public Date birthDate;

	public ClientDetails(String name, String address, Date birthDate, String username, String password) {

		if (name == null || address == null || birthDate == null || username == null || password == null)
			System.err.println("Error change details transaction");

		else {

			this.name = name;
			this.address = address;
			this.birthDate = birthDate;
			this.username = username;
			this.password = password;
		}
	}
}
