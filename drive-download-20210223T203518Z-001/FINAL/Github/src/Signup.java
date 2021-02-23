import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Signup {
	
	
	static Connection myConn;
	static Statement mystmt;
	  
	public void signuppage(){
		Main mainobj = new Main();
			try{ 
				
				myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
				mystmt = myConn.createStatement();
				
				System.out.println("----------------------SignUp------------------------"); 
				Scanner myObj = new Scanner(System.in);
				//user_id(pk), password, name, email, city, state, country
				
				System.out.println("Enter your name :");
				String username = myObj.next();
				
				System.out.println("Enter your email Id :");
				String useremail = myObj.next();
				
				System.out.println("Enter your password :"); 
				String userpass = myObj.next();
				
				System.out.println("Enter your city :"); 
				String usercity = myObj.next();
				
				System.out.println("Enter your state :"); 
				String userstate = myObj.next();
				
				System.out.println("Enter your country :"); 
				String usercountry = myObj.next();
				
				System.out.println("user name is: "+useremail+" password is :"+userpass);
				
				/*
				 SQL query
				 Add the user in the user table
				 If successfull, show msg -> user added successfully
				 
				ResultSet myRs = mystmt.executeQuery("select * from users");
				while(myRs.next()){
					System.out.println(myRs.getString("user_id")+", "+myRs.getString("password")+", "+myRs.getString("name"));
				}*/
				
				mainobj.main(null);
				
			} catch(Exception exc){
				exc.printStackTrace();
			}
		}
}
