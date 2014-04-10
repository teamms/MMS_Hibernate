package mms.processing;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import mms.models.Person;

public class LoginManager {
	private SessionFactory sessionFactory;
	public LoginManager(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	public Person checkLogin(String userName,String password){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	
		Query query = session.createQuery("from Person where userName = :userName and password=:password ");
		query.setParameter("userName", userName);
		query.setParameter("password", password);
		List list = (List) query.list();
		if(list.isEmpty())
			return null;
		Person person= (Person)list.get(0);
		session.getTransaction().commit();
		session.close();
		return person;
	}
}
