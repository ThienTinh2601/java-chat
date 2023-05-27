package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
public class kn {
	
		public static void main(String[] args) {
			String url = "jdbc:mysql://localhost:3306/connect";
			String userName = "root";
			String pasword = "thanhtinh2601";
			try {	
				//Driver class name
	//			Class.forName("com.mysql.jdbc.Driver");
				//no need to load JDBC driver class name explicitly (since JDBC 4.0)
				Connection con = DriverManager.getConnection(url, userName, pasword);
				System.out.println("1. connected successfuly 1");
				//con.close();
			} catch (Exception e) {
				System.out.println("2. connected error");
			}
    }
}

