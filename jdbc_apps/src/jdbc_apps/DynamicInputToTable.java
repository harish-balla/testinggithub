package jdbc_apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInputToTable {

	public static void main(String[] args) {
		Connection con=null;
		Statement st = null;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student name ,student id :");
		String name=sc.next();
		int id=sc.nextInt();
		//if()
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","hari");
			st=con.createStatement();
			int x=st.executeUpdate("insert into emp values('"+name+"',"+id+")");
			System.out.println(x);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();st.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}

	}

}
