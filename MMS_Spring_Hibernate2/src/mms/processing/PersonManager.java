package mms.processing;

import java.util.ArrayList;
import java.util.List;

import mms.models.MMSPoint;
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
	public ArrayList<String> GetSuggestion(String userName,int limit){
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("from MMSPoint where (username1 =:userName1 OR username2=:userName2) and point>0 order by point DESC").setMaxResults(limit);
		query.setParameter("userName1", userName);
		query.setParameter("userName2", userName);
		List list=(List) query.list();
		session.getTransaction().commit();
		session.close();
		
		if(list.isEmpty())
			return null;
		ArrayList<String> suggestion=new ArrayList<String>();
		for(int i=0;i<list.size();i++){
			if(((MMSPoint)list.get(i)).getUsername1().equals(userName))
				suggestion.add(((MMSPoint)list.get(i)).getUsername2());
			else
				suggestion.add(((MMSPoint)list.get(i)).getUsername1());
		}
		return suggestion;
	}
	public Person getPersonFromUserName(String userName){
		String name;
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("from Person where userName =:userName");
		query.setParameter("userName", userName);
		List list=query.list();
		Person person=(Person) list.get(0);
		session.getTransaction().commit();
		session.close();
		
		
		
		return person;
	}
	
	
}
