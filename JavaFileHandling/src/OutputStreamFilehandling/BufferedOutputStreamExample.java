package OutputStreamFilehandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamExample {

	public BufferedOutputStreamExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("F:\\fout.txt");
			try (OutputStream os = new BufferedOutputStream(fout)) {
				String s = "Welcome to Java I/O tutorials";
				byte[] b = s.getBytes();
				
				os.write(b);
				os.flush();
				os.close();
				fout.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
