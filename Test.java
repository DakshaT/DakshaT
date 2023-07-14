package com.blinkx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	//very nice from git hub
	//2nd comment
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
