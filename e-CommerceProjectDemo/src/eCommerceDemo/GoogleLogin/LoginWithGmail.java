package eCommerceDemo.GoogleLogin;

import java.util.ArrayList;
import java.util.List;

public class LoginWithGmail {
	
	static List<Gmail> gmails;
	
	public LoginWithGmail() {
		gmails = new ArrayList<>();
		gmails.add(new Gmail("first name","last name","gmail","password"));
	}
	
	public boolean login(String mail,String password){
        if(find(mail) != null && find(mail).getPassword().equals(password)) {
            return true;
        }
        return false;
    }
	
	 public Gmail find(String mail){
	        Gmail gmailToReturn = LoginWithGmail.gmails.stream()
	                .filter((user) -> user.getMail().equals(mail) )
	                .findFirst()
	                .orElse(null);
	        return gmailToReturn;
	        
	 }

}
	 
	 
