package com.simplilearn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.simplilearn.entity.Product;
import com.simplilearn.util.HibernateUtility;

/**
 * Servlet implementation class ProductValidation
 */
@WebServlet("/productValidation")
public class ProductValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw = response.getWriter();
			
			pw.println("<html><body>");
			
			String name = request.getParameter("name");
			String price = request.getParameter("price");
			
			
			
			// STEP 1: Gets SessionFactory Object
			SessionFactory sf = HibernateUtility.buildSessionFactory();
			
			// STEP 2: Open Sesson
			Session session = sf.openSession();
			
			
			Transaction tx = session.beginTransaction();
				Product ep = new Product();
				ep.setProductName(name);
				
				
				session.save(ep);
			
			tx.commit();
			
			pw.println("<h3 style=color:green'> Product is Added successfully ! </h3>");
			
			session.close();
		}
	}


				


