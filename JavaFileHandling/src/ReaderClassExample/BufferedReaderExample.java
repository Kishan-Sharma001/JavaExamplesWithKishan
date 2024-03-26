package ReaderClassExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public BufferedReaderExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("F:\\filetest.txt");
		BufferedReader br = new BufferedReader(fr);
		int i ;
		while((i= br.read())!=-1) {
			
			System.out.print((char)i);
		}
		
		br.close();
		fr.close();
		}

	}


