
public class Employee {

	private String empName;
	private String empId;
	private Salary salary;

	public Employee ( String empName , String empId ) {
		this.empName = empName;
		this.empId = empId;
	}

	public Salary getSalary ( ) {
		return salary;
	}

	public void setSalary ( Salary salary ) {
		this.salary = salary;
	}

	public String getEmpName ( ) {
		return empName;
	}

	public void setEmpName ( String empName ) {
		this.empName = empName;
	}

	public String getEmpId ( ) {
		return empId;
	}

	public void setEmpId ( String empId ) {
		this.empId = empId;
	}

	@Override
	public String toString ( ) {
		return "ID : "+empId+" Name : "+empName;
	}


}
