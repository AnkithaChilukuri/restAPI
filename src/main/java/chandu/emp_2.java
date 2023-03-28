package chandu;

public class emp_2 {
	public int id;
	public String name;
	public long salary;
	public float Experience;
	public String skills;
	
	public emp_2() {
		super();
	}

	public emp_2(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		//this.salary = salary;
		this.Experience = Experience;
		this.skills = skills;
		
	}
	
//	public long findSalary() {
//		double salary;
//		salary = (Experience*10000.0)+(skills*1000.0);
//	}
	
	public long calbonus() {
		long bonus;
		bonus= (salary/100)*15;
		return bonus;
	}
	
	public long totalSalary() {
		return salary+calbonus();
		//return salary;
	}

	@Override
	public String toString() {
		return "emp_2 [id=" + id + ", name=" + name + ", salary=" + salary + ", calbonus()=" + calbonus()
				+ ", totalSalary()=" + totalSalary() + "]";
	}
	
}
