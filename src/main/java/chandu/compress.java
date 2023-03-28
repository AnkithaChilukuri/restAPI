package chandu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class compress {
	public String compress1() throws Exception {
		        FileInputStream fin=new FileInputStream("C:\\Users\\user\\Pictures\\Screenshots\\Screenshot (12).png");
		        DeflaterInputStream din=new DeflaterInputStream(fin);
		        FileOutputStream fout=new FileOutputStream("D:/java files/compress.txt");
		        int ch=din.read();
		        while(ch!=-1) {
		        	fout.write(ch);
		        	ch=din.read();
		        }
		        return "compressed" ;
		        }
	public String decompress() throws IOException {
		FileInputStream fin=new FileInputStream("D:/java files/compress.txt");
			InflaterInputStream iin=new InflaterInputStream(fin);
			FileOutputStream fout=new FileOutputStream("D:/java files/decompress.png");
				int ch=iin.read();
				while(ch!=-1) {
					fout.write(ch);
					ch=iin.read();
				}
				return "decompressed";
	}
}