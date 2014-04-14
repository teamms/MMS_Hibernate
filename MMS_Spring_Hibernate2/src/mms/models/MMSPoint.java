package mms.models;
import javax.persistence.Entity;
import javax.persistence.Table;

import mms.models.Person;
import mms.processing.PointManager;
@Entity
@Table (name="MMSPoints")
public class MMSPoint {
	private String username1;
	private String username2;
	private int point;
	public String getUsername1() {
		return username1;
	}
	public void setUsername1(String username1) {
		this.username1 = username1;
	}
	public String getUsername2() {
		return username2;
	}
	public void setUsername2(String username2) {
		this.username2 = username2;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
