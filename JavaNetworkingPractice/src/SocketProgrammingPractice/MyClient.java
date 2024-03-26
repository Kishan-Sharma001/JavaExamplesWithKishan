package SocketProgrammingPractice;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
	
	
	

	public MyClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost",5000);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			dout.writeUTF("Hello Server");  
			dout.flush();  
			dout.close();
			
		}catch(Exception e){
			e.printStackTrace();
		};
		

	}

}
