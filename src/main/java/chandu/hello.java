package chandu;

import javax.ws.rs.Produces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class hello {
	@GET
    public String get() {
		return "Hello";
	}
	
	@GET
	@Path("/Longest/{string}")
	@Produces
	public String splitIt(@PathParam("string")String str) {
		 Longest aobj=new Longest();
		 aobj.s1=str;
		 String result = aobj.longest();
		return result;
		
	}
	@GET
	@Path("/emp/{id},{name},{salary}")
	@Produces
	public String task(@PathParam("id")int id,@PathParam("name")String name,@PathParam("salary")long sal){
		emp a = new emp();
		a.id=id;
		a.name=name;
		a.salary = sal;
		long result = a.calSal();
		return result+"";
		
	}
	@GET
	@Path("/rearrange/{string}")
	@Produces
	public String task2(@PathParam("string")String Str) {
		rearrange a= new rearrange();
		a.str=Str;
		String result = a.arrange();
		return result;
	}
	
	@GET
	@Path("/task/{str}")
	@Produces
	public String task3(@PathParam("str")String str) {
		task a = new task();
		a.str=str;
		int result = a.value();
		return result+"";
	}
	
	@GET
	@Path("/dataType/{str}")
	@Produces
	public String task4(@PathParam("str")String str) {
	     dataType a= new dataType();
	     a.str = str;
	     String result = a.type();
	     return result;
	}
	
	@GET
	@Path("/task2/{str}")
	@Produces
	public String task5(@PathParam("str")String str) {
		task2 a = new task2();
		a.Name =str;
		return "";
	}
	
	@GET
	@Path("/ENCRYPT998/{str}")
	@Produces
	public String Encrypt(@PathParam("str")String str) {
		ENCRYPT998 a = new ENCRYPT998();
		a.str=str;
		String result = a.encrypt();
		return result;
	}
	
//	@GET
//	@Path("/evaluation_2_1/{a},{b}")
//	@Produces
//	public String lambdaDisp(@PathParam("a")int a,@PathParam("b")int b) {
//			evaluation_2_1 l=(x,y)->{
//				if(x > y) 
//					return x +"is Greater than" + y;
//				else if(x < y)
//					return y + "is less than" + x;
//		};
//	}
	
	    @GET
	    @Produces("text/plain")
	    @Path("/arr_methods/{b}")
	    public String array(@PathParam("b")int b) {
	    	arr_methods array=new arr_methods();
	    	array.a=b;
	    	 array.check();
	    	 //array.addValue(25, 10);
	    	 array.multiple(5);
	    	 return array.readArray();
	    }
	    
	    @GET
	    @Produces("text/html")
	    @Path("/emp_2")
	    public String getEmp() {
	    	int ids[] = {1,2,3,4,5,6};
	    	String names[] = {"chandu","lakshmi","Indhu","Ajay","Vivek","vamsi"};
	    	long sal[] = {25000,16000,32000,72000,45000,53000};
	    	
	    	emp_2 emps[] = new emp_2[6];
	    	for(int i=0 ; i< emps.length ;i++) 
	    		emps[i] = new emp_2(ids[i],names[i],sal[i]);
	    	
	    		String result="";
	    		for(emp_2 e : emps) {
	    			e.calbonus();
	    		    e.totalSalary();
	    			result+=e.toString()+"<br>";
	    	}
	    	return result;
	    }
	    

		@GET
		@Path("office/{usage}")
		public String getSignal(@PathParam("usage")String usage) {
			office purpose=office.WAITING_LOBBY;
			office pur[]=office.values();
			purpose.people=30;
			try {
				office purpose1=office.valueOf(usage.toUpperCase());
				String msg="";
				switch(purpose) {
				case WAITING_LOBBY:
					msg="please wait";
					break;
				case CAFETERIA:
					msg="Have some coffee and RELAX";
					break;
				case CONFERENCE_ROOM:
					msg="Discussions for the new project"; 
					break;
				case MANAGER_ROOM:
					msg="Company manager is Monitoring every employee";
					break;
				case TRAINING_ROOM:
					msg="New employees are trained in their respective technology";
					break;
				}
				return purpose.toString()+"<br>"+purpose.usage+"<br>"+msg;
			}
			catch(IllegalArgumentException ex) {
				return "no such room";
			}	
		}
		
		@GET
		@Produces("text/html")
		@Path("/Arith_ops/{operation},{a},{b}")
		public String arith(@PathParam("operation")String operation,@PathParam("a")double a,@PathParam("b")double b) {
			Arith_ops ar = Arith_ops.ADD;
			
			try {
				Arith_ops op =Arith_ops.valueOf(operation.toUpperCase());
				String msg="";
			    switch(op) {
			       case ADD:
				   msg="Addition of a and b is "+(a+b);
				   break;
			       case SUB:
			       msg="Subtraction of a and b is "+(a-b);
			       break;
			       case MUL:
				       msg="Multiplication of a and b is "+(a*b);
				       break;
			       case DIV:
				       msg="Division of a and b is "+(a/b);
				       break;
			}
			return op.toString()+"<br>"+op.operation+"<br>"+msg;
			}
			catch(IllegalArgumentException ex) {
				return null;
		}
	}
		
		
	@GET
	@Path("/files/{name},{a},{b}")
	public String Add(@PathParam("name") String name,@PathParam("a") int a,@PathParam("b")int b) throws IOException {
		fileOperations op = new fileOperations();
		return op.fileAdd("ank",(a+b)+"");
	}
	@GET
	@Path("/file/{name}")
	public String add1(@PathParam("name") String name) throws IOException {
		fileOperations op = new fileOperations();
		return op.copy(name);
	}
	
	@GET
	@Path("/comp")
	public String encrypt() throws Exception {
		compress op = new compress();
		//return op.compress1();
		return op.decompress();
	}
	
	@GET
	@Path("obj_file")
	public String objToFile() throws Exception {
		int id1 [] = {1,2,3,4};
		String names[]= {"Ankitha","Vandana","Lavanya","Susmitha"};
		String courses[]= {"Java","Database","Python","Oracle"};
		double fees[]= {60000,20000,45000,35000};
		obj_file[] s=new obj_file[4];
		
		for(int i=0 ; i< s.length ;i++) {
			s[i] = new obj_file(id1[i],names[i],courses[i],fees[i]);
			   FileOutputStream fout=new FileOutputStream("D:/java files/"+s[i].id+".txt");
			   ObjectOutputStream oout=new ObjectOutputStream(fout);
			   oout.writeObject(s);
		}
    		
		   return "data saved";
		}
	
	@GET
	@Path("read_line/{n}")
	public String readLine (@PathParam("n")int n) throws Exception {
		readline f = new readline();
		return f.readLine(n);
		}
	
	@GET
	@Path("/intArray")
	public String find() throws IOException {
		int n1[]= {1,2,3,4,5,6,7,8,9};
		FileOutputStream fout=new FileOutputStream("D:/java files/"+"data"+".txt");
		fout.write(Arrays.toString(n1).getBytes());
 		return "file created";
	}
	
	@GET
	@Path("/ArrayIndex/{n}")
	public String find(@PathParam("n") int n) throws IOException {
		intArray a = new intArray(n);
		return a.readValue(n);
	}
}