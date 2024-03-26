package InputStreamExample;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public FileInputStreamExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("F:\\outputDemo1.txt");
			int i =0;
			while((i=fin.read())!=-1) {
				
				System.out.print((char)i);
			}
			
			
			
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


