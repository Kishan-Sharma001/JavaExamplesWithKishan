package WriterClassExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public BufferedWriterExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\bw.xlsx"));
		bw.write("This is the Sample File for BufferWriter ");
		bw.close();

	}

}
