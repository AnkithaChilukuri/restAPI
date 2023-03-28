package chandu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ank")

public class ank {
	public String str;
	
	@GET
	@Path("/{str}")
	@Produces
	
	public String word(@PathParam("str")String str) {
		String op = "";
		char c[]= str.toCharArray();
		
		//for(int i=0;i<str.length();i++) {
			if(str.length()%2==0) {
				 op+=(str.charAt((str.length()/2)-1)+str.charAt(str.length()/2 ));
				
			}
			else {
				op+=str.charAt(str.length()/2);
			}
		//}
		
		return op+"";
	}

}
