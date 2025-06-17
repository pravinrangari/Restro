<%
String check =(String)session.getAttribute("adminlogin");
if(check==null)
{
response.sendRedirect("adminlogin.jsp");
return;
}

%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Admin Panel</title>
  <style>
    /* Reset & base styles */
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }

    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
    }

    header {
      background-color: #2c3e50; /* Dark Blue Header */
      color: white;
      padding: 20px;
      text-align: center;
    }

    nav {
      background-color: #34495e;
      padding: 15px;
      display: flex;
      justify-content: center;
      gap: 30px;
    }

    nav a {
      color: #ecf0f1;
      text-decoration: none;
      font-weight: bold;
      transition: color 0.3s ease;
    }

    nav a:hover {
      color: #1abc9c;
    }

    main {
      padding: 30px;
      min-height: 400px;
      background-color: white;
    }

    footer {
      background-color: #95a5a6; /* Gray Footer */
      color: white;
      text-align: center;
      padding: 15px;
      position: relative;
      bottom: 0;
      width: 100%;
    }

    /* Responsive tweaks */
    @media (max-width: 600px) {
      nav {
        flex-direction: column;
        align-items: center;
        gap: 15px;
      }
    }
  </style>
</head>
<body>

  <header>
    <h1>Admin Panel</h1>
    <h2><%includefile= "message.jsp" %> </h2>
  </header>

  <nav>
    <a href="#ReadMessageServlet">Read Message</a>
    <a href="#home">Home</a>
    <a href="#change-password">Change Password</a>
    <a href="#logout">Logout</a>
  </nav>

  <main>
    <h2>Welcome to the Admin Dashboard</h2>
    <p>This is the main content area. Use the navigation links above to manage different tasks.</p>
  </main>

  <footer>
    &copy; 2025 Admin Panel. All rights reserved.
  </footer>

</body>
</html>
    