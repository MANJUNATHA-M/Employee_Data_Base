package edbms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import CustomException.EmployeeNotFoundException;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem
{

	Scanner scan =new Scanner (System.in);

	// we are using collection as our database 
	// Map interface -- it accept the values like key and value 
	// key -- is in string type bec its autogenarating with TCS 
	// values -- EMPLOYEE object ( contains age, name, salary)

	Map <String ,Employee> database=new LinkedHashMap<String,Employee>();

	@Override
	public void addemployee()
	{
		System.out.println("ENTER EMPLOYEE AGE");
		int age=scan.nextInt();

		System.out.println("ENETR EMPLOYEE NAME");
		String name=scan.next();

		System.out.println("ENTER THE EMPLOYEE SALARY");
		int sal=scan.nextInt();

		// Employee instance for accept the input value and storing into data base by using LinkedList into MAP
		Employee emp=new Employee(age,name,sal);


		// adding entry into database  (MAP INTERFACE )
		database.put(emp.getId(),emp);   // getting id from employee object and emp contains ( age,name,salary)


		System.out.println(" Employee Record Inserted Successfully *-* ");
		System.out.println(" Your Employee ID :"+emp.getId());

	}
	@Override
	public void displayemployee()
	{

		// Accepting the id from user and checking in database 
		// so irrespticve of charaters (convert into uppercase )
		System.out.println(" ENTER THE EMPLOYEE ID :");
		String id=scan.next();    

		id=id.toUpperCase();

		if(database.containsValue(id)) 
		{
			Employee emp=database.get(id); // if the particular id is present means show the detais 
			// of that employee id , age, name, salary.

			System.out.println(" EMPLOYEE ID : "+emp.getId());
			System.out.println(" EMPLOYEE ID : "+emp.getAge());
			System.out.println(" EMPLOYEE ID : "+emp.getName());
			System.out.println(" EMPLOYEE ID : "+emp.getSal());

			// or 
			//System.out.println(emp);  --> this will give complete details bec its overriden toString()
		}
		else
		{
			try
			{
				String message="EMPLOYEE DETAILS ARE NOT FOUND.. KAINDLY UPDATE EMPLOYEE DETALIS";
				throw new EmployeeNotFoundException(message);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void displayAllemployee()
	{


		if(!database.isEmpty()) 
		{

			System.out.println(" Employee Details are as Follows :");
			System.out.println("---------------------------------");

			// converting Map into Set by using keySet()
			Set<String> setOfKeys=database.keySet();

			// travers keys Employee id's
			for(String key : setOfKeys)
			{
				System.out.println(database.get(key));	
			}

		}
		else
		{
			try
			{
				String message= " NO Employee Details Found To Display!.....";
				throw new EmployeeNotFoundException(message);
			}
			catch( Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public void removeemployee()
	{

	}
	@Override
	public void removeAllemployee()
	{

	}
	@Override
	public void sortemployee()
	{

		List<Employee> list=new ArrayList<Employee>();
		
		
		Set<String> keys=database.keySet();
		
		for( String key : keys)
		{
		
		Employee emp=database.get(key);
		list.add(emp);
		}
		System.out.println("1:Sort Employee By ID\n2:Sort Employee By AGE");
		System.out.println("3:Sort Employee By NAME\n4:Sort Employee By MARKS");
		System.out.println("Enter Choice");
		
	}
	@Override
	public void updateemployee()
	{

	}
	@Override
	public void countemployee()
	{
		System.out.println(" NUMBER OF EMPLOYEE DETAILS PRESENT IN DATA BASE :--> "+database.size());
	}
	@Override
	public void getemployeehighestsal()
	{

	}@Override
	public void getemployeelowestsal()
	{

	}

}
