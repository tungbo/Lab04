package devmaster.edu.vn.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
		String hostName = "localhost";
	       String dbName = "lab04jspservletjdbc";
	       String userName = "root";
	       String password = "";
	       String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	       Connection conn = DriverManager.getConnection(connectionURL, userName, password);
	       return conn;
	}
//	public static void closeQuietly(Connection conn) {
//		try {
//			conn.close();
//		} catch (Exception e) {
//		}
//	}
//	
//	public static void rollbackQuitely(Connection conn) {
//		try {
//			conn.rollback();
//		} catch (Exception e) {
//		}
//	}
}
