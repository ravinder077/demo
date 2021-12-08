package com.aris.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aris.model.NumberModel;

public class AddServletscontroller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		NumberModel model=new NumberModel();
		
		String no1=req.getParameter("no1");
		String no2=req.getParameter("no2");
		
	     model.setNumberOne(no1);
	     model.setNumberTwo(no2);
	     
	    
		 req.setAttribute("model",model);
		 RequestDispatcher rd=req.getRequestDispatcher("output.jsp");
		 rd.forward(req, resp);
		 
		
	}


	
	

}
