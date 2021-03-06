package mms.processing;

import mms.models.MMSPoint;
import mms.models.Person;

public class PointManager {
	
	private static int religionScore=50;
	private static int locationScore=30;
	private static int educationScore=30; 
	private static int incomeScore=30; 
	private static int complexionScore=30; 
	private static int dietScore=30; 
	
	public static int pointCalculator(Person person1,Person person2){
		return intermediatePointCalculator(person1, person2)+intermediatePointCalculator(person2, person1);
	}
	public static int intermediatePointCalculator(Person person1,Person person2){
		int points=0;
		System.out.println(person1.getPreferences().getPreferredReligion()+" "+person2.getReligion());
		System.out.println(person1.getPreferences().getPreferredIncome()+" "+person2.getJob().getSalary());
		System.out.println(person1.getPreferences().getPreferredLocation()+" "+person2.getLocation().getCurrentCity());
		System.out.println(person1.getPreferences().getPreferredEducation()+" "+person2.getEducation().getDegree());
		System.out.println(person1.getPreferences().getPreferredComplexion()+" "+person2.getAppearance().getComplexion());
		System.out.println(person1.getPreferences().getPreferredDiet()+" "+person2.getMoreDetails().getDiet());
			try {
				
		if(person1.getPreferences().getPreferredReligion().equals(person2.getReligion())){
			points+=religionScore;
		}
		if(person1.getPreferences().getPreferredIncome().equals(person2.getJob().getSalary())){
			points+=incomeScore;
		}
		if(person1.getPreferences().getPreferredLocation().equals(person2.getLocation().getCurrentCity())){
			points+=locationScore;
		}
		if(person1.getPreferences().getPreferredEducation().equals(person2.getEducation().getDegree())){
			points+=educationScore;
		}
		if(person1.getPreferences().getPreferredComplexion().equals(person2.getAppearance().getComplexion())){
			points+=complexionScore;
		}
		if(person1.getPreferences().getPreferredDiet().equals(person2.getMoreDetails().getDiet())){
			points+=dietScore;
		}
			} catch (Exception e) {
				// TODO: handle exception
				return 0;
			}
		if(person1.getSex().equals(person2.getSex()))
			return 0;
			
		System.out.println(points);
		return points;
	}
	public MMSPoint getPoint(Person person1, Person person2){
		MMSPoint mmsPoint=new MMSPoint();
		if(person1.getUserName().compareTo(person2.getUserName())<0){
		mmsPoint.setUsername1(person1.getUserName());
		mmsPoint.setUsername2(person2.getUserName());
		}
		else{
			mmsPoint.setUsername1(person2.getUserName());
			mmsPoint.setUsername2(person1.getUserName());
		}		
		mmsPoint.setPoint(this.pointCalculator(person1, person2));
		return mmsPoint;
	}

}
