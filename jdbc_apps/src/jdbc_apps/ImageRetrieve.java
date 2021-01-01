package jdbc_apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageRetrieve {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","hari");
			PreparedStatement pst=con.prepareStatement("select * from student");
			ResultSet rs=pst.executeQuery();
			rs.next();
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			Blob b=rs.getBlob(3);
			FileOutputStream fis= new FileOutputStream("firstImage.jpeg");
			byte[] bb=b.getBytes(1, (int) b.length());
			fis.write(bb);
			System.out.println("done");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
