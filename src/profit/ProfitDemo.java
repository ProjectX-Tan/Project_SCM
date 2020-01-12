
import java.util.ArrayList;
import java.util.Scanner;

import test.Employee;

public class ProfitDemo {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Employee> emp = new ArrayList<Employee> ( );
		char keyOut = 0;
		String empName;
		String empId;
		Salary salary;
		double empSalary;
		double salesMonth;
		int menu;
		int indexOf;
		do {
			menu ( );
			menu = sc.nextInt ( );
			switch (menu) {
				case 1:
					System.out.print ("Enter ID : ");
					empId = sc.next ( );
					System.out.print ("Enter name : ");
					empName = sc.next ( );
					System.out.print ("Salary : ");
					empSalary = sc.nextDouble ( );
					salary = new Salary (empSalary);
					emp.add (new Employee (empName , empId));
					emp.get (indexOf (emp,empId)).setSalary (salary);
					System.out.println ("Add Employee Complete");
					break;
				case 2:
					if (emp.isEmpty ( )) {
						System.out.println ("Not have employee.");
						break;
					}
					displayEmployee (emp);
					System.out.print ("Enter ID To Delete : ");
					empId = sc.next ( );
					indexOf = indexOf (emp,empId);
					System.out.println ("Detail Employee : "+emp.get (indexOf (emp,empId)).toString () );
					deleteEmployee (emp,indexOf);
					break;
				case 3:
					if (emp.isEmpty ( )) {
						System.out.println ("Not have employee.");
						break;
					}
					displayEmployee (emp);
					break;
				case 4:
					if (emp.isEmpty ( )) {
						System.out.println ("Not have employee.");
						break;
					}
					displayEmployee (emp);
					System.out.print ("Enter ID : ");
					empId = sc.next ( );
					System.out.println ("Detail Employee : "+emp.get (indexOf (emp,empId)).toString () );
					System.out.print ("Enter Monthly Sales : ");
					salesMonth = sc.nextDouble ( );
					indexOf = indexOf (emp,empId);
					calCommission (emp.get (indexOf) , salesMonth);
					break;
				case 5:
					if (emp.isEmpty ( )) {
						System.out.println ("Not have employee.");
						break;
					}
					displayReport (emp);
					break;
			}
			System.out.print ("Continues? [y/n] : ");
			keyOut = sc.next ( ).charAt (0);
		} while (keyOut != 'n');
		System.out.println ("Thank you for use my program");
	}

	public static void menu ( ) {
		System.out.println ("\nWelcome to calculate salary program.");
		System.out.println ("  1. Add Employee.");
		System.out.println ("  2. Delete Employee.");
		System.out.println ("  3. Show Employee.");
		System.out.println ("  4. Update Period Sell Of Month.");
		System.out.println ("  5. Report Salary Of Employee.");
		System.out.print (" Enter Menu [1-4] : ");
	}

	public static void displayEmployee ( ArrayList<Employee> emp ) {
		for (int i = 0; i < emp.size ( ); i++)
			System.out.println (emp.get (i).toString ( ));
	}

	public static void calCommission ( Employee emp , double salesMonth ) {
		double commission = 0;
		if(emp.getSalary().getSalary() < 15000.0 && salesMonth > 100000) {
				commission = (salesMonth * 0.03)+3000;
		}else {
		if (salesMonth > 100000)
			commission = salesMonth * 0.03;
		else if (salesMonth > 50000)
			commission = salesMonth * 0.02;
		else if (salesMonth > 0)
			commission = salesMonth * 0.01;
		else
			commission = 0;
		}
		
		emp.getSalary ( ).setCommission (commission);
		System.out.println ("Update Complete");
	}


	public static void displayReport ( ArrayList<Employee> emp ) {
		for (int i = 0; i < emp.size ( ); i++)
			System.out.println ("\n"+emp.get (i).toString ( ) + " " + emp.get (i).getSalary ( ).toString ( ));
	}

	public static int indexOf ( ArrayList<Employee> emp , String empID ) {
		int index = -1;
		for (int i = 0; i < emp.size ( ); i++) {
			if (emp.get (i).getEmpId ( ).equals (empID)) {
				index = i;
				break;
			}
		}
		return index;
	}
	public static void deleteEmployee(ArrayList<Employee> emp,int indexOf){
		emp.remove (indexOf);
		System.out.println ("Delete Complete" );
		displayEmployee (emp);
	}
}
