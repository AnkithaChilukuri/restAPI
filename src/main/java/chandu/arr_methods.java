package chandu;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

//@Path("/arr_methods")
public class arr_methods {
	
	public int ar[];
	public int a;

	//@GET
	//@Path("/{a}")
	//@Produces
	public int[] check() {
		
		ar = new int[a];
		return ar;
	}
	
//	public String addValue(int x, int y) {
//		for(int i=0;i<ar.length;i++) {
//			if(y == i)
//				ar[i]=x;
//			else
//				ar[i]=0;
//		}
//		
//		return "Added";
//	}
    
	public void multiple(int c) {
		for(int i=0;i<ar.length;i++) {
			ar[i] = (c*(i+1));
		}
	}
	public String readArray() {
		return Arrays.toString(ar);
	}
	
	
}
