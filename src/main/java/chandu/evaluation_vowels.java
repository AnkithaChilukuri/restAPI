package chandu;

//In a string replace every vowel with next vowel and replace 'u' with 'a'.

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/evaluation_vowels")
public class evaluation_vowels {
	public String str;
	
	@GET
	@Produces
	@Path("/{str}")
	
	public String replace(@PathParam("str")String str) {
		String s2 = str.toLowerCase();
		//char c[] = s2.toCharArray();
		//String op = "";
		
		for(int i=0;i<str.length();i++) {
			if(s2.charAt(i)=='a') {
				s2=s2.replace('a', 'e');
				}
			else if(s2.charAt(i)=='e') {
				s2=s2.replace('e', 'i');
			}
			else if(s2.charAt(i)=='i') {
				s2=s2.replace('i', 'o');
			}
			else if(s2.charAt(i)=='o') {
				s2=s2.replace('o', 'u');
			}
			else if(s2.charAt(i)=='u') {
				s2=s2.replace('u', 'a');
			}
		}
		return s2+"";
	}
}
