package chandu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/sortingArray")
public class sortingArray {
	@GET
	@Path("/{str}")
	@Produces
	
	public String arrange(@PathParam("str") String str) {
		String s2= str.toLowerCase();
		char c[] = s2.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(c[i]>c[j]) {
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		return c+"";
	}

	private String String(char[] c) {
		// TODO Auto-generated method stub
		return null;
	}
}
