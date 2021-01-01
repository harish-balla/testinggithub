package jdbc_apps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageUpload {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hari");
			PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?) ");
			pst.setString(1, "hari");
			pst.setInt(2, 101);
			InputStream i=new FileInputStream("E:\\app_img_resources\\pg_logo.jpeg");
			pst.setBlob(3,i);
			pst.execute();
			System.out.println("done");
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
