package mms.resources;

import java.util.ArrayList;

public class EducationData {
	public final static ArrayList<String> degrees= new ArrayList<String>() {{
		add("12th Std");
		add("Graduate");
		add("PostGraduate");
		
	}};
	public final static ArrayList<String> graduationAreas=new ArrayList<String>() {{
		add("Engineering");
		add("Arts");
		add("Science");
		add("Aviation");
		add("Medicine");
		add("Architecture");
		add("Research");
		add("None");
	}};;
	public final static ArrayList<String> degreeNames=new ArrayList<String>() {{
		add("BTech");
		add("MBBS");
		add("BArch");
		add("BA");
		add("BSc");
		add("MTech");
		add("MSc");
	}};;
	public final static ArrayList<String> colleges=new ArrayList<String>() {{
		add("NIT");
		add("IIT");
		add("CET");
		add("TKM");
		add("Model Engg.");
		add("NSS");
		add("SCMS");
	}};;
	public final static ArrayList<String> postGraduations=new ArrayList<String>() {{
		add("Engineering");
		add("Arts");
		add("Science");
		add("Aviation");
		add("Medicine");
		add("Architecture");
		add("None");
	}};;
	
	
	private EducationData(){

	}
}
