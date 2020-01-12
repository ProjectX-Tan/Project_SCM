public class Salary {
	public double salary ;
	public double commission ;
	public Salary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public String toString() {
		return "Pay : "+(salary+commission);
	}
}
