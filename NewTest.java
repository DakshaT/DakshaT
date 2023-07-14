package com.blinkx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Thi sis very nice
public class MyNewServlet extends HttpServlet {
	//This is new line  dd
	//This is new line
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		System.out.println("Hi");
		out.write("Hi");
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		System.out.println(str);
		out.write(str);
		
	}

}
