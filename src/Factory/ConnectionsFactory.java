package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionsFactory {

	private static final String DBUSERNAME = "root";
	private static final String DBPASSWORD = "Ser@0000";
	private static final String DBURL = "jdbc:mysql://localhost:37786/pessoas";

	public static Connection createConnectioToMySql() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Connection ;
	}
}
