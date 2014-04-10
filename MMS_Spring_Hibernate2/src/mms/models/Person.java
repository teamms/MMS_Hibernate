package mms.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="PERSON_DETAILS")
public class Person {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String name;
	private String userName;
	private String password;
	@Embedded
	private Preferences preferences;
	@Embedded
	private Location location;
	@Embedded
	private Education education;
	@Embedded
	private Job job;
	@Embedded
	private Appearance appearance;
	@Embedded
	private Misc moreDetails;
	public Appearance getAppearance() {
		return appearance;
	}
	public void setAppearance(Appearance appearance) {
		this.appearance = appearance;
	}
	private String about;
	private String religion;
	public String getPassword() {
		return password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Preferences getPreferences() {
		return preferences;
	}
	public void setPreferences(Preferences preferences) {
		this.preferences = preferences;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Misc getMoreDetails() {
		return moreDetails;
	}
	public void setMoreDetails(Misc moreDetails) {
		this.moreDetails = moreDetails;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	

}
