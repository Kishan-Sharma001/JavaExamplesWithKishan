package ReaderClassExample;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public FileReaderExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		try (FileReader fw = new FileReader("F:\\filetest.txt")) {
			int i;
			while((i = fw.read())!=-1) {
				System.out.print((char)i);
				
				
			}
			fw.close();
			
		}
		
		

	}

}
