package mms.models;
import javax.persistence.Embeddable;

@Embeddable
public class Education {
	
	private String degree;
	private String graduationArea;
	private String degreeName;
	private String collegeName;
	private String postGraduation;
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	

	public String getGraduationArea() {
		return graduationArea;
	}
	public void setGraduationArea(String graduationArea) {
		this.graduationArea = graduationArea;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getPostGraduation() {
		return postGraduation;
	}
	public void setPostGraduation(String postGraduation) {
		this.postGraduation = postGraduation;
	}
	
	
	

}
