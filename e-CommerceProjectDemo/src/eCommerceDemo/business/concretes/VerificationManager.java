package eCommerceDemo.business.concretes;

import java.util.Scanner;

import eCommerceDemo.business.abstracts.VerificationManagerService;
import eCommerceDemo.core.MailSender;

public class VerificationManager implements VerificationManagerService{
	
	private MailSender mailSender;
	public VerificationManager(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	@Override
	public boolean verificate(String mail) {
		String code = "";
		try {
			code = mailSender.send(mail);
		}catch (Exception e) {
			System.out.println("Error!!");
		}
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter your incoming code: ");
			String enterCode = scan.nextLine();
			if(!code.equals(enterCode)) {
				return false;
			}
		}
		return false;
	}

	
}
