package chandu;

public class flames {
	
	public String str1;
	public String str2;
	
	public String game() {
			
			String	s1 = str1.toLowerCase();
			String  s2 = str2.toLowerCase();
			char a,b;
			
			for(int i=0;i<s1.length();i++) {
				a = s1.charAt(i);
				for(int j=0;j<s2.length();j++) {
					b = s2.charAt(j);
					if(a==b) {
						 s1.replace((char)i,(char) 0);
						 s2.replace((char)j,(char)0);
						 i--;
						 j--;
						}
				}
			}
			
			
		return "";
	}
}