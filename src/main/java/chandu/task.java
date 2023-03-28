package chandu;

public class task {
	public String str;
	 public int value() {
		 int sum = 0 ;
		 char c[]=str.toCharArray();
		 for(int i=0;i<str.length();i++) {
			 if(((int)c[i])%2==0) 
				 sum=sum+(int)c[i];
			 else if(((int)c[i])%2 == 1)
				 sum=sum-(int)c[i];
		 }
		return sum; 
	 }
}