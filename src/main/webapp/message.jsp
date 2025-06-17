<%
    if (session.getAttribute("msg") == null) {
        session.setAttribute("msg", "Test message from msg.jsp");
    }

    String message = (String) session.getAttribute("msg");
    if (message != null) {
%>
    <div style="color: blue; font-weight: bold;"><%= message %></div>
<%
        session.removeAttribute("msg");
    }
%>

