package chandu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/sameValues")
public class sameValues {
	
	public String str1;
	public String str2;
	
	@GET
	@Path("/{str1},{str2}")
	@Produces
	
	public String match(@PathParam("str1")String str1,@PathParam("str2")String str2) {
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				
				if(c1[i]==c2[j]) {
					str2 = str2.replace(c2[j], '*');
				}
				
			}
		}
		return str2;
	}
}