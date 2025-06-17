package tech.codehunt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tech.codehunt.service.AdminLoginServiceImpl;

@WebServlet("/AdminLoginServlet1")
public class AdminLoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Handle POST request (form submit)
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Get form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// Session object
		HttpSession session = request.getSession();

		// Service call
		AdminLoginServiceImpl adminLoginServiceImpl = new AdminLoginServiceImpl();
		String result = adminLoginServiceImpl.adminLoginService1(username, password);

		// Check result
		if ("VALID".equals(result)) {
			// Optional: store username in session if needed
			session.setAttribute("admin", username);

			// Forward to next servlet or page
			RequestDispatcher dispatcher = request.getRequestDispatcher("AdminLoginServlet2");
			dispatcher.forward(request, response);
		} else {
			// Store error in session & redirect back to login
			session.setAttribute("msg", result);
			response.sendRedirect("adminlogin.jsp");
		}
	}

	// Handle GET request (direct URL access or refresh)
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Redirect to login page
		response.sendRedirect("adminlogin.jsp");
	}
}
