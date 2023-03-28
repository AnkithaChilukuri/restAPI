package chandu;

public class Longest {
    public String s1;
	public String longest() {
		String ar[]=s1.split(" ");
		String s2=" ";
		 for(int i=0;i<ar.length;i++) {
			  if(ar[i].length()>=s2.length()) {
				  s2=ar[i];
				 }
			  }
		 return s2;
		}
}