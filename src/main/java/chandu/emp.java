package chandu;

public class emp {
	public int id;
    public String name;
	public long  salary;
	
	public emp() {
		
	}
	
	public emp(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public long calSal() {
		long sal = salary*12;
		return sal;
	}
}