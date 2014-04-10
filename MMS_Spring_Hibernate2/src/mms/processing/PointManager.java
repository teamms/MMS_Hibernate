package mms.processing;

import mms.models.Person;

public class PointManager {
	
	private static int religionScore=50;
	private static int locationScore=30;
	private static int educationScore=30; 
	private static int incomeScore=30; 
	private static int complexionScore=30; 
	
	public static int pointCalculator(Person person1,Person person2){
		return intermediatePointCalculator(person1, person2)+intermediatePointCalculator(person2, person1);
	}
	public static int intermediatePointCalculator(Person person1,Person person2){
		int points=0;
		if(person1.getPreferences().getPreferredReligion().equals(person2.getReligion())){
			points+=religionScore;
		}
		if(person1.getPreferences().getPreferredIncome()==person2.getJob().getSalary()){
			points+=incomeScore;
		}
		if(person1.getPreferences().getPreferredLocation().equals(person2.getLocation())){
			points+=locationScore;
		}
		if(person1.getPreferences().getPreferredEducation().equals(person2.getEducation())){
			points+=educationScore;
		}
		if(person1.getPreferences().getPreferredComplexion().equals(person2.getAppearance().getComplexion())){
			points+=complexionScore;
		}
		return points;
		
	}
	

}
