package groupProject;

import java.util.Date;
import java.util.List;

public class ScheduledAppointments {

	public String name;
	public Date appointmentDate;
	public List<String> ScheduledAppointments;

	public ScheduledAppointments(String name, Date appointmentDate) {
		String appointments = "Appointment with: " + name + " at " + appointmentDate + "\n";
		ScheduledAppointments.add(appointments);
	}
}
