import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class CreateRepo {

	static Connection myConn;
	static Statement mystmt;
	  
	public void createRepopage(){
		Home homeobj = new Home();
		
			try{ 
				myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
				mystmt = myConn.createStatement();
				
				Scanner myObj = new Scanner(System.in);
				
				System.out.println("----------------------Create Repository------------------------"); 
				
				//user_id, repo_id(pk), repo_url,repo_name, type, repo_desc, repo_created_at
				
				System.out.println("Enter your Repo Name :");
				String useremail = myObj.next();
				
				System.out.println("Enter your Repo Desc :"); 
				String userpass = myObj.next();
				
				Date repo_created_at = new java.util.Date();
				  
				/*
				 * 
				 Write a query to add the repo details.
				 
				 
				 ResultSet myRs = mystmt.executeQuery("select * from users");
				while(myRs.next()){
					System.out.println(myRs.getString("user_id")+", "+myRs.getString("password")+", "+myRs.getString("name"));
				}*/
				
				
				homeobj.homepage();
			} catch(Exception exc){
				exc.printStackTrace();
			}
		}

}
