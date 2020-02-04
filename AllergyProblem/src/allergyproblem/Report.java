package allergyproblem;

import java.util.*;

public class Report {

	private List<Patient> p = new ArrayList<>();
	
	public Report(Patient pp) {
		p.add(pp);
	}
	
	public void setPatient(Patient pp) {
		p.add(pp);
	}
	
	public List<Patient> getPatient() {
		return p;
	}
	
}
