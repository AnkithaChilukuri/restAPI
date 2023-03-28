package chandu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/indexValues")
public class indexValues {
	public String str;
	public String c;
	
	@GET
	@Path("/{str},{cha}")
	public String find(@PathParam("str")String str,@PathParam("cha")String c) {
		String s2 = str.toLowerCase();
		String op="";
		for(int i=0;i<=s2.length()-1;i++) {
			if(s2.charAt(i)==(c.charAt(0))) {
				op=op+ " " +i;
			}
		}
		return op;
	}
}
