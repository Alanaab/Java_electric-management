package com.xu.access;

import java.awt.List;
import java.awt.PopupMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBS {

	public Connection getConnection(){
       try {

			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			System.out.println("���ӳɹ�!!!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return null;
       
    }
	//�������
	public void Adddata(String a) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\97803\\Desktop\\MACHINE01.accdb","","");
		Statement stmt=con.createStatement();
		int add=stmt.executeUpdate(a);
		if(add>0){
			System.out.println("��ӳɹ�!!!");
		}else{
			System.out.println("���ʧ��!!!");
		}
		//��ÿһ���������ݿ�Ĳ������֮��Ҫ�ر�Statement����
		stmt.close();
		//��ÿһ���������ݿ�Ĳ������֮��Ҫ�ر�Connection����
		con.close();
	}
	
	public ArrayList Reacherdata(String chartname ,int title) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\97803\\Desktop\\MACHINE01.accdb","","");
		Statement stmt=con.createStatement();
		ArrayList list = new ArrayList();
		ResultSet rs=stmt.executeQuery(chartname);
		
		while(rs.next()){          
			
			
			list.add(rs.getInt(title));//��ȡ������ֵ
		
			
			System.out.println(rs.getString(title));
		}	  
		//��ÿһ���������ݿ�Ĳ������֮��Ҫ�ر�Statement����
		stmt.close();
		//��ÿһ���������ݿ�Ĳ������֮��Ҫ�ر�Connection����
		con.close();
		return list;
	}
	
	
	public void Deletedata() throws Exception {
		Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\97803\\Desktop\\MACHINE01.accdb","","");
		Statement stmt=con.createStatement();
		int del=stmt.executeUpdate("delete test where name ='���'");
		if(del>0){
			System.out.println("ɾ���ɹ�!!!");
		}else{
			System.out.println("ɾ��ʧ��!!!");
		}
		//��ÿһ���������ݿ�Ĳ������֮��Ҫ�ر�Statement����
		stmt.close();
		//��ÿһ���������ݿ�Ĳ������֮��Ҫ�ر�Connection����
		con.close();

	}
	
	public void Changedata(String a) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\97803\\Desktop\\MACHINE01.accdb","","");
		Statement stmt=con.createStatement();
		int upd=stmt.executeUpdate(a);
		if(upd>0){
			System.out.println("�޸ĳɹ�!!!");
		}else{
			System.out.println("�޸�ʧ��!!!");
		}
		//��ÿһ���������ݿ�Ĳ������֮��Ҫ�ر�Statement����
		stmt.close();
		//��ÿһ���������ݿ�Ĳ������֮��Ҫ�ر�Connection����
		con.close();

	}



	
	
		public static void main(String[] args) throws Exception {
			
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\97803\\Desktop\\MACHINE01.accdb","","");
			Statement stmt=con.createStatement();
			int add=stmt.executeUpdate("insert into test(VOL,CUR) values(10,30)");
			if(add>0){
				System.out.println("��ӳɹ�!!!");
			}else{
				System.out.println("���ʧ��!!!");
			}
			//��ÿһ���������ݿ�Ĳ������֮��Ҫ�ر�Statement����
			stmt.close();
			//��ÿһ���������ݿ�Ĳ������֮��Ҫ�ر�Connection����
			con.close();
		}	
	}





