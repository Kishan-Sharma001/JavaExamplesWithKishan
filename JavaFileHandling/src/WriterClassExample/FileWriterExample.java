package WriterClassExample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public FileWriterExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("F:\\filetest.txt");
		fw.write("This is File Writer Sample File");
		fw.close();

	}

}
