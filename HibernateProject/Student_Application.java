package org.nagul;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.nagul.entity.Students;

public class Student_Applicatiom {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Students.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			
			Students stu=new Students();
			
			session.beginTransaction();
			
			stu=session.get(Students.class, 5);
			session.delete(stu);
			
			session.getTransaction().commit();
			System.out.println("Row Deleted");
		}
		finally {
			
			session.close();
			factory.close();
		}
		

	}

}
