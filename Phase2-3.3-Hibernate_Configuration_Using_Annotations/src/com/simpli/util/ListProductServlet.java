package com.simpli.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.simpli.util.Eproduct;
import com.simpli.util.HibernateUtil;

/**
 * Servlet implementation class ListProductServlet
 */
@WebServlet("/listProduct")
public class ListProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session session = sf.openSession();

		/*
		 * HQL - Hibernate Query Language. This is very similar to SQL language, only
		 * difference is Instead of Table name you need to refer EntityName
		 * 
		 */
		List<Eproduct> products = session.createQuery(" from Eproduct").list();
		out.println("<h1> Product List :- </h1>");
		out.println("<style> table,td,th {border:1px solid green; padding:10px;}</style>");
		out.println("<table>");

		out.println("<tr>");
		out.print("<th> Product ID </th>");
		out.print("<th> Product Name </th>");
		out.print("<th> Product Price </th>");
		out.print("</tr>");

		for (Eproduct p : products) {
			out.print("<tr>");
			out.print("<td>" + p.getId() + "</td>");
			out.print("<td>" + p.getName() + "</td>");
			out.print("<td>" + p.getPrice() + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.println("</body></html>");
		session.close();
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
