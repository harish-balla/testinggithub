package jdbc_apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FirstJDBCApp {

	public static void main(String[] args) {
		Connection con=null;
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","hari");
		Statement st=con.createStatement();
		int x=st.executeUpdate("insert into emp values('bbb',103)");
		System.out.println(x);
		st.close();
		con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
