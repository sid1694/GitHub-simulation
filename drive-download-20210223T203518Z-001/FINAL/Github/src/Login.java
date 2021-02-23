import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	
	Home homeobj = new Home();
	static Connection myConn;
	static Statement mystmt;
	  
	public void loginpage(){
			try{ 
				myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
				mystmt = myConn.createStatement();
				
				Scanner myObj = new Scanner(System.in);
				System.out.println("----------------------Login------------------------"); 
				System.out.println("Enter your email Id :");
				String useremail = myObj.next();
				
				System.out.println("Enter your password :"); 
				String userpass = myObj.next();
				
				System.out.println("user name is: "+useremail+" password is :"+userpass);
				

				/*
				 * 
				 Write a query to check if the email and password is correct. 
				 If it is correct-> go ahead
				 else-> ask for mail and password again. (Use goto:)
				 
				 
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
