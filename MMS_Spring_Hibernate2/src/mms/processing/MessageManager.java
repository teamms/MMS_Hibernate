package mms.processing;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mms.models.Message;
import mms.models.Person;

public class MessageManager {
	private SessionFactory sessionFactory;
	
	
	public MessageManager(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public String sendMessage(String userName1,String userName2,String toInboxMessage){
		
		if(sessionFactory==null)
			sessionFactory=new Configuration().configure().buildSessionFactory();	
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	
		Query query = session.createQuery("from Person where userName = :userName");
		query.setParameter("userName", userName1);
		List list = (List) query.list();
		if(list.isEmpty())
			return null;
		query.setParameter("userName", userName2);
		list = (List) query.list();
		if(list.isEmpty())
			return null;
		Message message=new Message();
		message.setMessage(toInboxMessage);
		message.setUserName1(userName1);
		message.setUserName2(userName2);
		
		session.save(message);
		
		session.getTransaction().commit();
		session.close();
		return toInboxMessage;
	}
	
	public List<Message> getInboxList(String userName){
		
		if(sessionFactory==null)
			sessionFactory=new Configuration().configure().buildSessionFactory();		
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	
		Query query = session.createQuery("from Message where userName2 = :userName");
		query.setParameter("userName", userName);
		List<Message> list = (List<Message>) query.list();
		if(list.isEmpty())
			return null;
		
		session.getTransaction().commit();
		session.close();
		return list;
		
	}
}
