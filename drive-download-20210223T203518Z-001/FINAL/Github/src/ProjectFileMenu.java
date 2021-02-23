import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ProjectFileMenu {
	static Connection myConn;
	static Statement mystmt;
	  
	public void projectFileMenupage(){
		Home homeobj = new Home();
		Logout logoutobj = new Logout();
		CreateProjectFile projectfileobj = new CreateProjectFile();
		BranchMenu branchobj = new BranchMenu();
			try{ 
				
				myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
				mystmt = myConn.createStatement();
				Scanner myObj = new Scanner(System.in);
				System.out.println("----------------------------------------------");
				System.out.println("               Project File  Menu             ");
				System.out.println("----------------------------------------------");
				System.out.println("1.Commit\n2.Go to Home\n3.Logout");
				System.out.println("Enter your choice:");
				int choice = myObj.nextInt();
				 
				switch(choice){
					case 1:	
							System.out.println("Enter your comment:");
							String comment = myObj.next();
							//SQL QUERY TO CREATE A COMMIT with the comment we have taken from user If successful print. created
							//Print commented successfully.
							branchobj.branchMenupage();
							break; 	
						 
					case 2: homeobj.homepage();
						
						break;
						
					case 3: logoutobj.logoutpage();
						break; 
						
					default: System.out.println("Please enter valid choice.");
					homeobj.homepage();
				}
				
				
				
			} catch(Exception exc){
				exc.printStackTrace();
			}
		}


}
