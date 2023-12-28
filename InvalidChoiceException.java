package CustomException;

import java.lang.management.RuntimeMXBean;
import java.util.Comparator;

import edbms.Employee;

public class InvalidChoiceException extends RuntimeException {

	private String message;
	
	InvalidChoiceException(String message)
	{
		this.message=message;
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
	

}
