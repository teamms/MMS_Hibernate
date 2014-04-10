package mms.resources;

import java.util.ArrayList;

public class JobData {
	public final static ArrayList<String> fields= new ArrayList<String>() {{
		add("Computer Science");
		add("Mechanical");
		add("Medicine");
		add("Architecture");
	    }};
	public final static ArrayList<String> salaries=new ArrayList<String>() {{
	    add("5000-10000");
	    add("10000-20000");
	    add("20000-30000");
	    add(">30000");
	}};;
	public final static ArrayList<String> jobLocations=new ArrayList<String>() {{
	    add("Mavelikara");
	    add("Calicut");
	    add("Bangalore");
	}};;
	private JobData(){
		
	}
}
