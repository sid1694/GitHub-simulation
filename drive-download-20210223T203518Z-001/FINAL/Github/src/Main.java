import java.sql.*;
import java.util.Scanner;
 
public class Main {
	
	static Connection myConn;
	static Statement mystmt;
	 
	public static void main(String[] args) {
		Main mainobj = new Main();
		Signup signupobj = new Signup();
		Login loginobj = new Login();
		System.out.println("----------------------------------------------"); 
		System.out.println("                    Welcome!                  ");
		System.out.println("----------------------------------------------"); 
		try{
			myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
			mystmt = myConn.createStatement();
			
		} catch(Exception exc){
			exc.printStackTrace();
		}
		
		System.out.println("1.Signup\n2.Login");
		System.out.println("Enter your choice:");
		Scanner myObj = new Scanner(System.in);
		int choice = myObj.nextInt();
		 
		switch(choice){
			case 1:	signupobj.signuppage();
					break; 	
			
			case 2: loginobj.loginpage();
					break;
			
			default: {	System.out.println("Please enter valid choice.\n");
						mainobj.main(null);
			   		 }
		}
		
	}
	
 
	
//	private static void view_users_3(){
//		try{  
//			ResultSet myRs = mystmt.executeQuery("select * from users");
//			while(myRs.next()){
//				System.out.println(myRs.getString("user_id")+", "+myRs.getString("password")+", "+myRs.getString("name"));
//			}
//		} catch(Exception exc){
//			exc.printStackTrace();
//		}
//	}

}
