import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ViewFollowing {
	static Connection myConn;
	static Statement mystmt;
	  
	public void viewfollowingpage(){
		BranchMenu branchobj = new BranchMenu();
		Home homeobj = new Home();
		Logout logoutobj = new Logout(); 
			try{ 
				
				myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
				mystmt = myConn.createStatement();
				Scanner myObj = new Scanner(System.in);
				System.out.println("----------------------Following------------------------"); 
				//SQL QUERY TO VIEW THE FOLLOWing
				/*
				ResultSet myRs = mystmt.executeQuery("select * from users");
				while(myRs.next()){
					System.out.println(myRs.getString("user_id")+", "+myRs.getString("password")+", "+myRs.getString("name"));
				}*/
				
				System.out.println("1.Go to Home\n2.Logout");
				System.out.println("Enter your choice:");
				int choice = myObj.nextInt();
				 
				switch(choice){
					case 1: homeobj.homepage();
							break;
					case 2: logoutobj.logoutpage();
							break; 
					
					default: System.out.println("Please enter valid choice.");
							homeobj.homepage();

				}
				
				
				
			} catch(Exception exc){
				exc.printStackTrace();
			}
		}

}
