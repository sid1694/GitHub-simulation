import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Logout {
	
	Main mainobj = new Main();
	static Connection myConn;
	static Statement mystmt;
	
	public void logoutpage(){
		try{ 
			myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
			mystmt = myConn.createStatement();
			System.out.println("----------------------Logout------------------------"); 
			/* 
			 
			 SQL QUERY TO LOGOUT.
			 ResultSet myRs = mystmt.executeQuery("select * from users");
			while(myRs.next()){
				System.out.println(myRs.getString("user_id")+", "+myRs.getString("password")+", "+myRs.getString("name"));
			}
			 */
			 
			mainobj.main(null);
			
		} catch(Exception exc){
			exc.printStackTrace();
		}
	}
	
}
