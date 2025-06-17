package tech.codehunt.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import tech.codehunt.service.ContactServiceImpl;

@WebServlet("/ContactServlet1")
public class ContactServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");

		ContactServiceImpl contactService = new ContactServiceImpl();
		String result = contactService.ContactService1(name, email, subject, message);

		System.out.println("Result: " + result);

		if (result.equals("VALID")) {
			session.setAttribute("msg", "Message sent successfully!");
		} else {
			session.setAttribute("msg", result);
		}
		response.sendRedirect("contact.jsp");

	}
}
