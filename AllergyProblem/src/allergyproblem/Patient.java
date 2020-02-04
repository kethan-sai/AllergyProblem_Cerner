package allergyproblem;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.*;

public class Patient extends Person{

	private Allergy allergies;
	private List<Medication> medications = new ArrayList<>();
	private Temperature temperatures;
	
	private Map<Allergy, List<Medication>> mp = new HashMap<>();
	
	
	public Patient(String name, String phoneNumber, String emailAddress, Address address, Allergy allergies,Medication medication,Temperature temperatures) {
		super(name, phoneNumber, emailAddress, address);
		this.allergies = allergies;
		this.medications.add(medication);
		this.temperatures = temperatures;
		
		mp.put(allergies, medications);
	}

	

	public void display() {
		
		
		System.out.println("Temp :"+temperatures);
		for(Allergy al: mp.keySet()) {
			System.out.println("Symptoms: "+al.getSymptoms()+" Report: "+ al.getReport()+ " severity: "+al.getSeverity() +" allergies: "+allergies.getDiseaseName());
		}
		
	}
	public Allergy getAllergies() {
		return allergies;
	}

	public void setAllergies(Allergy allergies) {
		this.allergies = allergies;
	}
	
	public Temperature getTemperature() {
        return temperatures;
    }

    public void setTemperature(Temperature temperature) {
       this.temperatures=temperature;
    }
    
    public Map<Allergy, List<Medication>> getList(){
    	return mp;
    }
    
 
}
