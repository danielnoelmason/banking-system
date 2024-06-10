package groupProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleAppointmentTransaction {

	public int pos;
	public int clientID;
	public Date appointmentDate;

	public List<Date> appointments;
	public List<String> bankEmployeesWithAppointments;

	public void ScheduleAppointment(List<BankEmployee> bankClientsWithAppointments) {

		String error = checkTransactionStructure(bankClientsWithAppointments);

		if (error != null)
			printErrorMessage(error);

		else
			executeScheduleAppointmentTransaction(bankClientsWithAppointments);
	}

	public String checkTransactionStructure(List<BankEmployee> bankClientsWithAppointments) {

		if (clientID < 0 || appointmentDate == null)
			return "Error scheduling appointment transaction";

		pos = 0;

		if (pos < 0 || pos >= bankClientsWithAppointments.size())
			return "Invalid client id";

		return null;
	}

	public void printErrorMessage(String message) {

		System.err.println(message);
	}

	public void executeScheduleAppointmentTransaction(List<BankEmployee> bankClientsWithAppointments) {

		BankEmployee bankClient = bankClientsWithAppointments.get(pos);

		ScheduledAppointments scheduledAppointments = new ScheduledAppointments(name, appointmentDate);
	}
}
