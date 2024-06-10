package groupProject;

import java.util.Date;
import java.util.List;

public class BankEmployee extends Person {

	public String name = "X";

	public List<BankClient> bankClientsWithAppointments;
	public List<Date> appointmentDates;

	public static void print(List<BankClient> bankClients) {
		for (int i = 0; bankClients != null && i < bankClients.size(); ++i)
			bankClients.get(i).toPrint();
	}
}
