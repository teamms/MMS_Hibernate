package mms.processing;

import java.util.List;

import mms.models.Person;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PersonManager {
	private SessionFactory sessionFactory;
	public PersonManager(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public Person GetPersonFromDatabase(String userName){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	
		Query query = session.createQuery("from Person where userName = :userName");
		query.setParameter("userName", userName);
		List list = (List) query.list();
		if(list.isEmpty())
			return null;
		Person person= (Person)list.get(0);
		session.getTransaction().commit();
		session.close();
		return person;
	}
}
