package chandu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/duplicates")

public class duplicates {
	
	public String str;
	
	@GET
	@Path("/{str}")
	@Produces
	public String find(@PathParam("str")String str) {
		String s2 = str.toLowerCase();
		char c[] = s2.toCharArray();
		String op = "";
		for(int i=0;i<s2.length();i++) {
			
			if(!op.contains(c[i]+""))
				op+=c[i];
			
		}
		return op;
	}

}
