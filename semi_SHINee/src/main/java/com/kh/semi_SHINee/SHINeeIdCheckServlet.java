package com.kh.semi_SHINee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SHINeeIdCheckServlet
 */
@WebServlet("/SHINeeIdCheckServlet")
public class SHINeeIdCheckServlet extends HttpServlet {
	private static final String jdbcurl = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String username = "shinee";
	private static final String password = "shinee";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * 완성되지 않았습니다.
		 */
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(jdbcurl, username, password);
			String sql = "SELECT USER_ID FROM USER_INFO WHERE USER_ID = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			String userId = request.getParameter("userId");
			ps.setString(1, userId);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
			}else {
				
			}
		
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
