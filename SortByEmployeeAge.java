package CustomSorting;

import java.util.Comparator;

import edbms.Employee;

public class SortByEmployeeAge implements Comparator<Employee>{
	@Override
	public int compare(Employee e1 ,Employee e2) {
		return e1.getAge()-e2.getAge();
	}

}


