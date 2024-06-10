package groupProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookAppointmentTransaction {

	public List<Date> appointments;
	public List<String> bankEmployeesWithAppointments;

	public void bookAppointment(Date date, String employeeName) {

		if (date == null || employeeName == null)
			System.err.println("Error book appointment transaction");

		else {

			if (appointments == null)
				appointments = new ArrayList<Date>();

			appointments.add(date);

			if (bankEmployeesWithAppointments == null)
				bankEmployeesWithAppointments = new ArrayList<String>();

			bankEmployeesWithAppointments.add(employeeName);
		}
	}

	public boolean askForSchedulingAppointment(int clientID, Date date, String employeeName) {

		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(Read.read("apppoinment date"));
		} catch (ParseException ex) {
			ex.printStackTrace();
		}

		if (date == null || employeeName == null) {

			System.err.println("Error schedule appointment transaction");

			return false;
		}

		else {

			// Assume we sent a message to bank employee

			return true;
		}
	}

}
