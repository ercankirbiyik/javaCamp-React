package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer Ercan = new Customer(1,"Ercan","Kýrbýyýk");
		
		customerManager.add(Ercan);
		

	}

}
