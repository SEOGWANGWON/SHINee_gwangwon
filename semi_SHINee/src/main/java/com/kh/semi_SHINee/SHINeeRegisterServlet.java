package com.kh.semi_SHINee;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SHINeeCreateAccount
 */
@WebServlet("/SHINeeRegisterServlet")
public class SHINeeRegisterServlet extends HttpServlet {
	private static final String jdbcurl = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String username = "shinee";
	private static final String password = "shinee";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(jdbcurl, username, password);
			
			/*
			 * USER_ID VARCHAR2(12 BYTE) 
			 * USER_NAME VARCHAR2(15 BYTE) 
			 * USER_NICKNAME VARCHAR2(20 BYTE) 
			 * USER_PASSWORD VARCHAR2(20 BYTE) 
			 * EMAIL VARCHAR2(100 BYTE)
			 * PHONE_NUMBER VARCHAR2(11 BYTE)
			 */
			
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String pw = request.getParameter("pw");
			String Nname = request.getParameter("nickname");
			String email = request.getParameter("emailid");
			String phoneNumber = request.getParameter("phoneNumber");
			
			
			
			String sql = "INSERT INTO USER_INFO (USER_ID, USER_NAME, USER_NICKNAME, USER_PASSWORD, EMAIL, PHONE_NUMBER) "
					+ "VALUES(?, ?, ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, pw);
			ps.setString(4, Nname);
			ps.setString(5, email);
			ps.setString(6, phoneNumber);
			
			ps.executeUpdate();
			
			
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("SHINeeRegister.jsp");
		
		
	}

}
