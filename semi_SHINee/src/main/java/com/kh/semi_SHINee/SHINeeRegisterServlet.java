package com.kh.semi_SHINee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SHINeeCreateAccount
 */
@WebServlet("/SHINeeCreateAccount")
public class SHINeeRegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "shinee";
		String password = "shinee";
		
		Class.forName("")
	}

}
