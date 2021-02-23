import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Home {
	
	RepoMenu repoMenuobj = new RepoMenu();
	CreateRepo createRepoobj = new CreateRepo();
	Logout logoutobj = new Logout();
	
	static Connection myConn;
	static Statement mystmt;
	  
	public void homepage(){
			Home homeobj= new Home();
			ViewFollowers followersobj = new ViewFollowers();
			ViewFollowing followingsobj = new ViewFollowing();
			FollowUser followuser = new FollowUser();
			try{ 
				myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/github_cmpe180b","root","");
				mystmt = myConn.createStatement();
				Scanner myObj = new Scanner(System.in);
				
				System.out.println("----------------------------------------------");
				System.out.println("                      HOME                    ");
				System.out.println("----------------------------------------------");
				
				System.out.println("1.View Repositories\n2.Create Repository\n3.View Followers\n4.View Following\n5.Follow a user\n6.Logout");
				System.out.println("Enter your choice:");
				int choice = myObj.nextInt();
				 
				switch(choice){
					case 1:	repoMenuobj.repoMenupage();
							break; 	
					
					case 2: createRepoobj.createRepopage(); 
							break;
					
					case 3: 
						followersobj.viewfollowerpage();
						break;
						
					case 4: followingsobj.viewfollowingpage();
						break;
						
					case 5:  followuser.followuserpage();
						break;
						
					case 6: logoutobj.logoutpage();
						break;
						
					default: System.out.println("Please enter valid choice.");
				}
				
				
				
			} catch(Exception exc){
				exc.printStackTrace();
			}
		}
}
