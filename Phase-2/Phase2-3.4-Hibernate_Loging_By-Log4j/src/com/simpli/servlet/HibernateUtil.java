package com.simpli.servlet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {

		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			//cfg.addAnnotatedClass(Eproduct.class);
			

			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
