package mms.models;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Connection {
	
	private String userName;
	private ArrayList<String> connections;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public ArrayList<String> getConnections() {
		return connections;
	}
	public void setConnections(ArrayList<String> connections) {
		this.connections = connections;
	}
	public void setNewConnection(String userName,SessionFactory sessionFactory){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		connections.add(userName);
		session.update(this);
		session.getTransaction().commit();
		session.close();
	}
}
