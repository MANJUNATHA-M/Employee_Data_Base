package CustomSorting;

import java.util.Comparator;

import edbms.Employee;

public class SortByEmployeeSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1,Employee e2)
	{
		return e1.getSal()-e2.getSal();
	}

}
