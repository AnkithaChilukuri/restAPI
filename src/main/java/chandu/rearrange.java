package chandu;

public class rearrange {
	public String str;
	public String arrange() {
		String str2 = str.toLowerCase();
		char c[]=str2.toCharArray();
		for(int i=0;i <str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(c[i]>c[j]) {
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
			
		}
		return new String(c);
	}

}
