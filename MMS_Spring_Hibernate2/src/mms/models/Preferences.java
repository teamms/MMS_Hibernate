package mms.models;
import javax.persistence.Embeddable;

@Embeddable
public class Preferences {
	private String preferredLocation;
	private String preferredReligion;
	private String preferredEducation;
	private String preferredComplexion;
	private String preferredDiet;
	private int preferredIncome;
	
	public int getPreferredIncome() {
		return preferredIncome;
	}
	public void setPreferredIncome(int preferredIncome) {
		this.preferredIncome = preferredIncome;
	}
	public String getPreferredLocation() {
		return preferredLocation;
	}
	public void setPreferredLocation(String preferredLocation) {
		this.preferredLocation = preferredLocation;
	}
	public String getPreferredReligion() {
		return preferredReligion;
	}
	public void setPreferredReligion(String preferredReligion) {
		this.preferredReligion = preferredReligion;
	}
	public String getPreferredEducation() {
		return preferredEducation;
	}
	public void setPreferredEducation(String preferredEducation) {
		this.preferredEducation = preferredEducation;
	}
	public String getPreferredComplexion() {
		return preferredComplexion;
	}
	public void setPreferredComplexion(String preferredComplexion) {
		this.preferredComplexion = preferredComplexion;
	}
	public String getPreferredDiet() {
		return preferredDiet;
	}
	public void setPreferredDiet(String preferredDiet) {
		this.preferredDiet = preferredDiet;
	}
	

}
