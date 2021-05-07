package eCommerceDemo;

import java.util.Scanner;

import eCommerceDemo.business.abstracts.UserManagerService;
import eCommerceDemo.business.concretes.AuthManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.business.concretes.VerificationManager;
import eCommerceDemo.core.LoginWithGmailAdapter;
import eCommerceDemo.core.VerificationMailSender;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.dataAccess.concretes.InMemoryUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

		static boolean loggedIn;
		static Scanner scan = new Scanner(System.in);
		static UserManagerService userService = new UserManager(UserDatabase());
		static AuthManager authManager = new AuthManager(userService,new VerificationManager(new VerificationMailSender()),new LoginWithGmailAdapter());		
		
	    public static void main(String[] args) {	
	    	
	    	 String mainMessage = "^^^^^^^^^^^^^^ Welcome to the e-Commerce system ^^^^^^^^^^^^^^^^\n\n" +
	                 "1. Sign in.\n" +
	                 "2. Sign in with Google\n" +
	                 "3. Sign up\n" +
	                 "4. Sign Out\n" +
	                 "0. Show main message\n" +
	                 "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
	    	 
	         String loggedMessage = "********** Welcome to the e-Commerce system **********\n\n" +
	                 "1. Delete my account\n"+
	                 "2. Log out\n" +
	                 "0. Show the message\n" +
	                 "************************************************";;

	         System.out.println(mainMessage);
	         int key;
	         while (true){
	             System.out.print("Please select an action: ");
	             key = scan.nextInt();
	             switch (key){
	                 case 1:
	                     login();
	                     break;
	                 case 2:
	                     loginWithGoogle();
	                     break;
	                 case 3:
	                     register();
	                     break;
	                 case 4:
	                     return;
	                 case 0:
	                     System.out.println(mainMessage);
	                     break;
	                 default:
	                     System.out.println("Please make the right choice.");
	             }
	             
	             
	             while (loggedIn){
	                 System.out.print("Please select an action: ");
	                 key = scan.nextInt();
	                 switch (key){
	                     case 1:
	                         deleteAccount();
	                         break;
	                     case 2:
	                         System.out.println(mainMessage);
	                         loggedIn = false;
	                         break;
	                     case 0:
	                         System.out.println(loggedMessage);
	                         break;
	                     default:
	                         System.out.println("Please make the right choice.");
	                 }
	             }
	         }
	     }

	     private static UserDao UserDatabase() {
			
			return null;
		}

		public static void register(){
	         scan.nextLine();
	         String firstName,lastName,mail,password;
	         System.out.print("Please enter your name: ");
	         firstName = scan.nextLine();
	         System.out.print("Please enter your surname: ");
	         lastName = scan.nextLine();
	         System.out.print("Please enter your email: ");
	         mail = scan.nextLine();
	         System.out.print("Please enter your password: ");
	         password = scan.nextLine();
	         User user = new User(InMemoryUserDao.getLastId() + 1,firstName,lastName,mail,password);
	         loggedIn = authManager.register(user);
	     }

	     public static void login(){
	         scan.nextLine();
	         String mail,password;
	         System.out.print("Please enter your email: ");
	         mail = scan.nextLine();
	         System.out.print("Please enter your password: ");
	         password = scan.nextLine();
	         User user = new User(mail,password);
	         loggedIn = authManager.login(user);
	     }

	     public static void loginWithGoogle(){
	         scan.nextLine();
	         String email,password;
	         System.out.print("Please enter your email: ");
	         email = scan.nextLine();
	         System.out.print("Please enter your password: ");
	         password = scan.nextLine();
	         User user = new User(email,password);
	         loggedIn = authManager.loginWithGoogle(user);
	     }

	     public static void deleteAccount(){
	         System.out.println("It has not been added to the system yet!");
	     }


}
