package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationController2
 */
public class RegistrationController3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController3() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				HttpSession session=request.getSession();
				String qual = request.getParameter("qual");
				
					if(qual.isEmpty())
				{
					RequestDispatcher rd = request.getRequestDispatcher("home2.jsp");
					out.println("<font color=red>Please don't keep it empty</font>");
					rd.include(request, response);
				}
				else
				{
					RequestDispatcher rd = request.getRequestDispatcher("showInfo.jsp");
					session.setAttribute("sessionQual", qual);
					rd.forward(request, response);
				}
				
			}

	}


