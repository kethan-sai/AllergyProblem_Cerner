package allergyproblem;

public class Allergy {

	private String symptoms;
	private String report;
	private Severity severity;
	private String diseaseName;
	
	public Allergy(String symptoms,String report,Severity severity,String diseaseName) {
		this.symptoms=symptoms;
		this.report=report;
		this.severity=severity;
		this.diseaseName=diseaseName;
	}
	
	public String getSymptoms() {
		return symptoms;
	}
	
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	
	public Severity getSeverity() {
		return severity;
	}
	
	public void setSeverity(Severity severity) {
		this.severity= severity;
	}
	
	public String getReport() {
		return report;
	}
	
	public void setReport(String report) {
		this.report= report;
	}
	
	public String getDiseaseName() {
		return diseaseName;
	}
	
	public void setDiseaseName(String diseaseName) {
		this.diseaseName=diseaseName;
	}
}
