package chandu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOperations {
	public String fileAdd(String fileName,String data) throws IOException {
		FileOutputStream out = new FileOutputStream("D:\\java files\\"+fileName+".txt");
		//String data = "";
		out.write(data.getBytes());
		return "";
	}
	
	public String copy(String file2) throws IOException {
		FileInputStream in = new FileInputStream("D:\\java files\\ank.txt");
		int ch=in.read();
		String s = "";
		while(ch!=-1)
		{
			s+=(char)ch;
			ch = in.read();
		}
		FileOutputStream out = new FileOutputStream("D:\\java files\\"+file2+".txt");
		out.write(s.getBytes());
		return "data copied";
		}
        
}
