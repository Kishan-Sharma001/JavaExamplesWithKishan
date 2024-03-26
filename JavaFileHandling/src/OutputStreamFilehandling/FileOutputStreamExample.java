package OutputStreamFilehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public FileOutputStreamExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		try {FileOutputStream fout = new FileOutputStream("F:\\outputDemo1.pdf");
		String s = "This is the FileOutputStream hands on practice";
		byte b[] = s.getBytes(); //to convert the String into the byte 
		
		fout.write(b);
		fout.close();
		}
		catch (IOException e ) {
			e.getMessage();
		}
		}

	}


