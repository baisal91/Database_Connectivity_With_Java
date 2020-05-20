package com.example.bussiness.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDao {

	
	public static final String uname="root";
	public static final String password="Root@123";
	
	private Connection conn;
	private Statement stmt;
	
	
	public static final String driver="com.mysql.cj.jdbc.Driver";
	//public static final String dburl="jdbc:mysql://localhost/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	public static final String dburl="jdbc:mysql://localhost/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	
	public StudentDao() {
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(dburl,uname,password);
			stmt = conn.createStatement();
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public ArrayList<Student> fetchStudentData() {
		
		ResultSet rs=null;
		ArrayList<Student> list = null;
		
		
		try {
			rs=stmt.executeQuery("select * from student1");
			list= new ArrayList<Student>();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1), 
									rs.getString(2),
									rs.getString(3), 
									rs.getInt(4), 
									rs.getInt(5), 
									rs.getInt(6) ));
				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return list;
		
	}
	
	
}






