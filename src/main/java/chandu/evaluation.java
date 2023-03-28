package chandu;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/evaluation")
public class evaluation {
	public String str;
	public int num;
	

	@GET
	@Path("/{str},{num}")
	@Produces
	public String evaluate(@PathParam("str")String str,@PathParam("num")int num) {
		String str2 = str.toLowerCase();
		
		String op = "";
		String s="_";
		for(int i=0;i<str2.length();i++){
			if(i!=0 && i%num==0) {
				op+=s;
			}
			else if(i<num) {
				op=str2+s;
			}
			else {
				op=op+s;
			}
			op=op+str2.charAt(i);
		}
		return op;	
	}
}
 