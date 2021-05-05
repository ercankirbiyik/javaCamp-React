package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class JLoggerManagerAdaptar implements LoggerService{
	
	@Override
	
	public void logToSystem(String message) {
		jLoggerManager JLoggerManager = new jLoggerManager();
		JLoggerManager.log(message);
		
	}

	
	
}
