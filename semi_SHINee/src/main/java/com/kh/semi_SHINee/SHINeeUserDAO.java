package com.kh.semi_SHINee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SHINeeUserDAO {
	private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String username = "shinee";
	private static final String password = "shinee";

	
	public SHINeeUserDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<SHINeeUserData> getAllUserInfo(){
		List<SHINeeUserData> userInfo = new ArrayList<>();
		
		try {
			Connection con = DriverManager.getConnection(jdbcURL, username, password);
			String sql = "SELECT * FROM USER_INFO";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				String userId = result.getString("USER_ID");
				String userName = result.getString("USER_NAME");
				String userNickname = result.getString("USER_NICKNAME");
				String userPW = result.getString("USER_PASSWORD");
				String email = result.getString("EMAIL");
				String phoneNumber = result.getString("PHONE_NUMBER");
				
				SHINeeUserData user = new SHINeeUserData(userId,userName,userNickname,userPW,email,phoneNumber);
				userInfo.add(user);
					
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userInfo;
	}
	
	public SHINeeUserData getSHINeeUserInfo(String userId) {
		SHINeeUserData user	= new SHINeeUserData();
		Connection con = null;
		try {
			con = DriverManager.getConnection(jdbcURL,username ,password);
			String sql = "SELECT * FROM USER_INFO WHERE USER_ID = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, userId);
			
			ResultSet result = ps.executeQuery();

			if(result.next()) {
				String userID = result.getString("USER_ID");
				String userName = result.getString("USER_NAME");
				String userNickname = result.getString("USER_NICKNAME");
				String userPW = result.getString("USER_PASSWORD");
				String email = result.getString("EMAIL");
				String phoneNumber = result.getString("PHONE_NUMBER");
				
				user.setUserId(userID);
				user.setUserName(userName);
				user.setUserNickname(userNickname);
				user.setUserPW(userPW);
				user.setEmail(email);
				user.setPhoneNumber(phoneNumber);
			}
			
			result.close();
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
		
		
	}
	public SHINeeUserData getSHINeeUserIdCheck(String userId) {
		SHINeeUserData user	= new SHINeeUserData();
		Connection con = null;
		try {
			con = DriverManager.getConnection(jdbcURL,username ,password);
			String sql = "SELECT USER_ID FROM USER_INFO WHERE USER_ID LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, userId);
			
			ResultSet result = ps.executeQuery();

			if(result.next()) {
				String userID = result.getString("USER_ID");
				
				user.setUserId(userID);
				
			}
			
			result.close();
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
	
	
}
