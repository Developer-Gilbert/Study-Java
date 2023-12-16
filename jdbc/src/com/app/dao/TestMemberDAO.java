package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class TestMemberDAO {
	public Connection connenction;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;
	
	public void checkID(String memberIdentification) {
		String qurey = "SELECT TESTMEMBER_ID FROM TBL_TESTMEMBER WHERE TESTMEMBER_IDENTIFICATION = ?";
		connection = DBConnecter.getConnection();
		try {
			PreparedStatement = connection.preparedStatement(qurey);
			PreparedStatement.setString(1, TestMemberIdentification);
			resultSet = PreparedStatement.executeQuery();
			check = resultSet.next();
		
			
		} catch (SQLException e) {
			System.out.println("checkId(String) SQL¹® ¿À·ù");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(resultSet != null) {
				resultSet.close();
			}
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			
			if(connenction != null) {
				connenction.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
			}
		}	
		return check;
	}
}
