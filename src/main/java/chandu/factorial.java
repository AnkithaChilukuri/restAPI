package chandu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/factorial")

public class factorial {
	
	@GET
	@Path("/{num}")
	@Produces
	
	public String Fact(@PathParam("num")int num) {
		arith fact=(n)->{
			int val =1;
			for(int i=1;i<=n;i++) {
				val=val*i;
				}
			return val;
			};
		return fact.per(num)+"";
	}
}
