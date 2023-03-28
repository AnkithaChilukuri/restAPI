package chandu;

import java.io.FileInputStream;

public class readline {
	
	public String readLine(int linenum) throws Exception {

		FileInputStream in = new FileInputStream("D:/java files/PrintLine.txt");
			int ch = in.read();
			int count=0;
			String data = "";
			while(ch!=-1) {
				if(ch==13) {
					count++;
				}
				if(count==linenum-1) {
					data+=(char)ch;
				}
				ch = in.read();
			}
			return data;
		}

}
