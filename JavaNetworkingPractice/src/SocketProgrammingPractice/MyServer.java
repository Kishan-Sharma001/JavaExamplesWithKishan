package SocketProgrammingPractice;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public MyServer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(5000);  
			Socket s=ss.accept();//establishes connection   
			DataInputStream dis=new DataInputStream(s.getInputStream());  
			String  str=(String)dis.readUTF();  
			System.out.println("message= "+str);  
			ss.close(); 
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
