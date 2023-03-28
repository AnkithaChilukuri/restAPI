package chandu; 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/vowels")
public class vowels {
	
	public String str;
	
	@GET
	@Path("/{str}")
	@Produces
	
	public String count(@PathParam("str")String str) {
		
		String s2=str.toLowerCase();
		int count=0;
		for(int i=0;i<s2.length();i++) {
			if((s2.charAt(i)=='a')||(s2.charAt(i)=='e')||(s2.charAt(i)=='i')
					||(s2.charAt(i)=='o')||(s2.charAt(i)=='u')) {
				count++;
			}
		}
		return count+"";
	}
}