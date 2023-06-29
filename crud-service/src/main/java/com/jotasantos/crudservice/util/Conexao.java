package com.jotasantos.crudservice.util;


import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {

	private static final Connection connection = construirConexao();

	private static Connection construirConexao() {
		try {				
					              
			Class.forName("com.mysql.jdbc.Driver");			
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/p1/world", "root",
					"root");

		} catch (Exception ex) {
			System.err.println("Conexão falhou: " + ex.getMessage());
			ex.printStackTrace();
		}
		return null;
	}

	public static Connection getConnection() {
		return connection;
	}
}
