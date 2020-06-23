package com.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {
	
	public static void main (String args[]) {
		
		Configuration cf = new Configuration ();
		cf.configure("Configure.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		
		Students s = new Students();
		s.setSid(01);
		s.setSname("Ashok");
		s.setSmark(95);
		
		Students s1 = new Students();
		s1.setSid(02);
		s1.setSname("Ashmit");
		s1.setSmark(99);
		
		Transaction tx = se.beginTransaction();
		se.save(s);
		se.save(s1);
		tx.commit();
		
		se.close();
		sf.close();
		
		
		
		
	}

}
