package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;
import com.demo.model.MyUser;

public class EmployeeTest {
public static void main(String[] args) {
	Employee e1=new Employee(1,"Sourabh",120000);
	Employee e2=new Employee(2,"Dhruv",140000);
	Employee e3=new Employee(3,"Ashish",160000);
	MyUser u1=new MyUser(1,"Kiran");
	MyUser u2=new MyUser(2,"Anshu");
	MyUser u3=new MyUser(3,"Tejaswimi");
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session sess=sf.openSession();
	Transaction tr=sess.beginTransaction();
	sess.save(e1);
	sess.save(e2);
	sess.save(e3);
	sess.save(u1);
	sess.save(u2);
	tr.commit();
	sess.close();
	
}
}
