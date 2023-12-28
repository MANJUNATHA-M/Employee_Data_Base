package edbms;

import java.util.Scanner;

public class EmployeeSolution {



	public static void main(String[] args) 
	{
		System.out.println("welcome to Employee  Detail's DataBase ");
		System.out.println("------------------------------------------------");

		Scanner scan=new Scanner (System.in);

		EmployeeManagementSystem ems =new EmployeeManagementSystemImpl();

		// for looping the driven program
		while(true)
		{
			// menu driven program

			System.out.println("1.ADD EMPLOYEE\n2.DISPLAY EMPLOYEE\n3.DISPLAY All EMPLOYEE");
			System.out.println("4.REMOVE EMPLOYEE\n5.REMOVE ALL EMPLOYEE\n6.SORT EMPLOYEE");
			System.out.println("7.UPDATE EMPLOYEE\n8.COUNT EMPLOYEE\n9.GET HIGHEST SALARAY\n10.GET LOWEST SALARY");
			System.out.println("11.EXIT");
			System.out.println("-----------------------------------------------");

			System.out.println("Enter your choice");

			int choice=scan.nextInt();

			switch(choice)
			{
			case 1:
				ems.addemployee();
				break;
			case 2: 
				ems.displayemployee();
				break;
			case 3:
				ems.displayAllemployee();
				break;
			case 4:
				ems.removeemployee();
				break;
			case 5:
				ems.removeAllemployee();
				break;
			case 6:
				ems.removeAllemployee();
				break;
			case 7:
				ems.sortemployee();
				break;
			case 8:
				ems.countemployee();
				break;
			case 9:
				ems.getemployeehighestsal();
				break;
			case 10:
				ems.getemployeelowestsal();
				break;
			case 11:
				System.out.println("THANK YOU *-*");
				System.exit(0);
				break;
			default :
				System.out.println("");
			} // switch end 
			System.out.println("--------------------------------------------------------");
		}// while end
	}// main end
}
