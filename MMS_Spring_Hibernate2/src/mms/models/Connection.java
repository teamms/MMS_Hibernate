package mms.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
@Entity
@Table (name="Connections")
public class Connection {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int pointId;
	private String userName1;
	private String userName2;
	private int connectionStatus;
	
	public Connection(String userName1, String userName2, int connectionStatus) {
		this.userName1 = userName1;
		this.userName2 = userName2;
		this.connectionStatus = connectionStatus;
	}

	public String getUserName1() {
		return userName1;
	}

	public void setUserName1(String userName1) {
		this.userName1 = userName1;
	}

	public String getUserName2() {
		return userName2;
	}

	public void setUserName2(String userName2) {
		this.userName2 = userName2;
	}

	public int getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(int connectionStatus) {
		this.connectionStatus = connectionStatus;
	}
}
