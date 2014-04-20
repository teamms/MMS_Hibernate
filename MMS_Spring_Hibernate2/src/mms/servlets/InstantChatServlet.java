package mms.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InstantChatServlet
 */
@WebServlet("/InstantChatServlet")
public class InstantChatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName1=request.getParameter("userName1");
		String userName2=request.getParameter("userName2");
		String toInboxMessage=request.getParameter("toInboxMessage");

		
	}

}
