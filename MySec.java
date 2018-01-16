import java.sql.*;  
public class MySec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Second!!");
		try{  
			//step1 load the driver class  
			Class.forName("org.h2.Driver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:h2:~/test","sa","");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from TEST");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
	}

}
