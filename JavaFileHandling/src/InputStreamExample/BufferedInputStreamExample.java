package InputStreamExample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamExample {

	public BufferedInputStreamExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("F:\\fin.txt");
		
		InputStream IS = new BufferedInputStream(fin);
		
		int i=0;
		while ((i=IS.read())!=-1) {System.out.print((char)i);
		}
		
		
		IS.close();
		fin.close();

	}

}
