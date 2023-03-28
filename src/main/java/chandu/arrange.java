package chandu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/arrange")
public class arrange {
	public String str;
	
	@GET
	@Produces
	@Path("/{str}")
	
	public String rearrange(@PathParam("str")String str) {
		String s2 =str.toLowerCase();
		char c[] = s2.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(c[i]>c[j]) {
					char temp = c[j];
					c[j]=c[i];
					c[i]=temp;
				}
			}
		}
		
		return new String(c);
	}

}
