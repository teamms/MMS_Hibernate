package mms.resources;

import java.util.ArrayList;

public class JobData {
	public final static ArrayList<String> fields= new ArrayList<String>() {{
		add("Engineering");
		add("Research");
		add("Medicine");
		add("Architecture");
	    }};
	public final static ArrayList<String> salaries=new ArrayList<String>() {{
	    add("Less than 4 LPA");
	    add("4-6 LPA");
	    add("6-10 LPA");
	    add("10-15 LPA");
	    add("More than 15 LPA");
	}};;
	public final static ArrayList<String> jobLocations=new ArrayList<String>() {{
	    add("Mavelikara");
	    add("Calicut");
	    add("Trivandrum");
	    add("Cochin");
	    add("Kannu");
	    add("Bangalore");
	}};;
	private JobData(){
		
	}
}
