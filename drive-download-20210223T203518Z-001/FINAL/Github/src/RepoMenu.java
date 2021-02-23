import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class RepoMenu {
	static Connection myConn;
	static Statement mystmt;
	  
	public void repoMenupage(){
		Home homeobj = new Home();
		Logout logoutobj = new Logout();
		CreateBranch branchobj = new CreateBranch();
		BranchMenu branchmenuobj = new BranchMenu();
			try{ 
				
				myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
				mystmt = myConn.createStatement();
				Scanner myObj = new Scanner(System.in);
				System.out.println("----------------------------------------------");
				System.out.println("                Repository Menu               ");
				System.out.println("----------------------------------------------");
				System.out.println("1.View Branches\n2.Create a Branch\n3.Go to Home\n4.Logout");
				System.out.println("Enter your choice:");
				int choice = myObj.nextInt();
				 
				switch(choice){
					case 1: branchmenuobj.branchMenupage();
							break; 	
					
					case 2: branchobj.createBranchpage();  
							break;
					
					case 3: homeobj.homepage();
						
						break;
						
					case 4: logoutobj.logoutpage();
						break; 
						
					default: System.out.println("Please enter valid choice.");
					homeobj.homepage();
				}
				
				
				
			} catch(Exception exc){
				exc.printStackTrace();
			}
		}
}
