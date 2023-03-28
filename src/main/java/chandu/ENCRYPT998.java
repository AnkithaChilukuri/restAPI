package chandu;

public class ENCRYPT998 {
	public String str;
	
	public String encrypt() {
		
		String str2 = str.toLowerCase();
		char c[]=str2.toCharArray();
		 
		String c1 = new String(new char[]{'a','b','c','d','e','f','g','h','i'});
		String c2 = new String(new char[]{'j','k','l','m','n','o','p','q','r'});
		String c3 = new String(new char[]{'s','t','u','v','w','x','y','z'});
		String op="";
		for(int i=0;i<str2.length();i++) {
			if(c1.contains(c[i]+"")) 
				op+="1"+(c1.indexOf(c[i])+1);
	
			else if(c2.contains(c[i]+"")) 
				op+="2"+(c2.indexOf(c[i])+1);
			
			else if(c3.contains(c[i]+"")) 
				op+="3"+(c3.indexOf(c[i])+1);
		
		}
		return op;
	}
	
	public String decrypt() {
		
		char c[]= str.toCharArray();
		String c1 = new String(new char[]{'a','b','c','d','e','f','g','h','i'});
		String c2 = new String(new char[]{'j','k','l','m','n','o','p','q','r'});
		String c3 = new String(new char[]{'s','t','u','v','w','x','y','z'});
		String op1="";
		
		return op1;
		
	}
}