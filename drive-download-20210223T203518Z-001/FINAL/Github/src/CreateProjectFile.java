import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class CreateProjectFile {
	static Connection myConn;
	static Statement mystmt;
	  
	public void createProjectfilepage(){
		BranchMenu branchMenuobj = new BranchMenu();
		
			try{ 
				myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
				mystmt = myConn.createStatement();
				
				Scanner myObj = new Scanner(System.in);
				System.out.println("----------------------Create a Project File------------------------"); 
				
				System.out.println("Enter your Project File Name :");
				String userprojectfile = myObj.next();
				Date projectfiledate = new Date();
				  
				  
				/*
				 * 
				 Write a query to add the project file details.
				 
				 
				 ResultSet myRs = mystmt.executeQuery("select * from users");
				while(myRs.next()){
					System.out.println(myRs.getString("user_id")+", "+myRs.getString("password")+", "+myRs.getString("name"));
				}*/
				
				branchMenuobj.branchMenupage();
				
			} catch(Exception exc){
				exc.printStackTrace();
			}
		}

}
