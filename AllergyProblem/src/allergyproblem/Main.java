package allergyproblem;

//import java.text.ParseException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();

		System.out.println("Enter phone number");
		String numb = sc.nextLine();
		
		System.out.println("Enter email adress");
		String email = sc.nextLine();
		
		System.out.println("Enter address");
		String addr = sc.nextLine();
		
		System.out.println("Enter City");
		String city = sc.nextLine();
		
		System.out.println("Enter State");
		String state = sc.nextLine();
		
		System.out.println("Enter Zipcode");
		int zip = sc.nextInt();
		sc.close();
		
		//will take a loop and get info and number of patients entering
		Address addr1 = new Address(addr, city, state, zip);
		
		Allergy al = new Allergy("Cough", "james", Severity.High, "CronoVirus");
		
		Date date = new Date();
		
		Medication md1 = new Medication("4", "04-12-2018", date);
		
		Temperature tp = new Temperature(99, Location.Mouth);
		
		Patient p1 = new Patient(name, numb, email, addr1, al,md1,tp); //use name, numb and email in person class

		Report r = new Report(p1); //contains list of patients
		
		List<Patient> ls = r.getPatient();
		
		Timer time = new Timer(); //timer for every 5 secs
		TimerTask s= new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Patients who need to take medications");
				for(Patient pr : ls) {
					pr.display();
				}
				System.exit(0);
			}
		};
		
		time.schedule(s, 0, 5000);
		
		
		
	}

}
