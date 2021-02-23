import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class CreateBranch {

	static Connection myConn;
	static Statement mystmt;
	  
	public void createBranchpage(){
		RepoMenu repoMenuobj = new RepoMenu();
		
			try{ 
				myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
				mystmt = myConn.createStatement();
				
				Scanner myObj = new Scanner(System.in);
				System.out.println("----------------------Create a Branch------------------------"); 
				
				System.out.println("Enter your Branch Name :");
				String userbranch = myObj.next();
				  
				  
				/*
				 * 
				 Write a query to add the branch details.
				 
				 
				 ResultSet myRs = mystmt.executeQuery("select * from users");
				while(myRs.next()){
					System.out.println(myRs.getString("user_id")+", "+myRs.getString("password")+", "+myRs.getString("name"));
				}*/
				
				repoMenuobj.repoMenupage();
				
			} catch(Exception exc){
				exc.printStackTrace();
			}
		}

}
