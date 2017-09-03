package desafio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory {

	public static Connection connectionFactory() {

		String url = "jdbc:mysql://localhost:3306/valemobi?useSSL=true";
		String user = "root";
		String password = "";

		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection connection) {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection connection, PreparedStatement stmt) {
		close(connection);
		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection connection, PreparedStatement stmt, ResultSet rs) {
		close(connection, stmt);
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
