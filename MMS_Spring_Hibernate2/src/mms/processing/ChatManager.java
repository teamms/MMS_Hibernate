package mms.processing;

import java.util.List;

import mms.models.Message;
import mms.models.Person;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ChatManager {
	
	private SessionFactory sessionFactory;
	
	public ChatManager(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
		public List<Person> getAllPersons(){
		
			//sessionFactory=
			
			
		if(sessionFactory==null)
			sessionFactory=new Configuration().configure().buildSessionFactory();		
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	
		Query query = session.createQuery("from Person");
		//query.setParameter("userName", userName);
		List<Person> list = (List<Person>) query.list();
		if(list.isEmpty())
			return null;
		
		session.getTransaction().commit();
		session.close();
		return list;
		
	}

}
