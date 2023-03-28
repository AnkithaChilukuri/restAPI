package chandu;

import java.io.FileInputStream;
import java.io.IOException;

public class intArray {
	public int n;

	public intArray(int n) {
		super();
		this.n = n;
	}
	
	public String readValue(int n) throws IOException {
		FileInputStream in = new FileInputStream("D:\\java files\\data.txt");
		int ch = in.read();
		String data = " ";
		while(ch!=-1) {
		   data+=(char)ch;
		   ch = in.read();
		}
		System.out.println(data);
		String ar[]=data.split(",");
		if(n<ar.length)
			return ar[n];
		else
			return "index not found";
	}
}
