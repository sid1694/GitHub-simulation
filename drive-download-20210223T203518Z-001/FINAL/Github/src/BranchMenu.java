import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class BranchMenu {
	static Connection myConn;
	static Statement mystmt;
	  
	public void branchMenupage(){
		BranchMenu branchobj = new BranchMenu();
		Home homeobj = new Home();
		Logout logoutobj = new Logout();
		ProjectFileMenu projectfilemenuobj = new ProjectFileMenu();
		CreateProjectFile projectfileobj = new CreateProjectFile();
			try{ 
				
				myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
				mystmt = myConn.createStatement();
				
				System.out.println("----------------------------------------------");
				System.out.println("                  Branch Menu                 ");
				System.out.println("----------------------------------------------");
				
				Scanner myObj = new Scanner(System.in);
				
				System.out.println("1.View Project Files\n2.Create a Project File\n3.View Commits\n4.Go to Home\n5.Logout");
				System.out.println("Enter your choice:");
				int choice = myObj.nextInt();
				 
				switch(choice){
					case 1:	projectfilemenuobj.projectFileMenupage();
							break; 	
					
					case 2: projectfileobj.createProjectfilepage(); 
							break;
					
					case 3: /*
							SQL query to list all the commits and comments of that project file
					 		*/
						branchobj.branchMenupage();
						break;
					case 4: homeobj.homepage();
						
						break;
						
					case 5: logoutobj.logoutpage();
						break; 
						
					default: System.out.println("Please enter valid choice.");
						homeobj.homepage();
				}
				
				
				
			} catch(Exception exc){
				exc.printStackTrace();
			}
		}

}
