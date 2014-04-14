package mms.processing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import mms.models.Connection;
import mms.models.Person;

public class ConnectionManager {
	public void sendConnectionRequest(Person person1,Person person2,SessionFactory sessionfactory){
		Connection connection=new Connection(person1.getUserName(), person2.getUserName(),0);
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(connection);
		session.getTransaction().commit();
		session.close();
	}
}
