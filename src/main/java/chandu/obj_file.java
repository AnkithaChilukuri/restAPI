package chandu;

import java.io.Serializable;

public class obj_file implements Serializable{

	public int id;
	public String name;
	public String course;
	public double fee;
	
	public obj_file() {
		
	}
	
	public obj_file(int id,String name,String course,double fee) {
		super();
		this.id=id;
		this.name=name;
		this.course =course;
		this.fee=fee;
	}
	
	@Override
	public String toString() {
		return "obj_file [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}

}
