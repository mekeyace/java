import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Server에 여러개의 포트를 오픈 8001,8002
//Exception : bind Exception (PORT 충돌)

public class chat_server {
	public static void main(String[] args) {
		/*
		int port[] = {8001,8002};
		int ea = port.length;
		int w = 0;
		openchat oc = null;
		while(w<ea) {
			oc = new openchat(port[w]);
			oc.start();
			w++;
		}
		*/
		int port = 8003;
		openchat oc = null;
		oc = new openchat(port);
		oc.start();
	}
}

class openchat extends Thread{
	String ip = "127.0.0.1";
	int pt = 0;
	ServerSocket sk = null;
	InputStream is = null;
	OutputStream os = null;
	public openchat(int p) {
		this.pt = p;
	}
	@Override
	public void run() {
		try {
			this.sk = new ServerSocket(this.pt);
			
			while(true) {
			Socket s = this.sk.accept();	//해당 port 모두 오픈
			
			this.is = s.getInputStream();
			this.os = s.getOutputStream();
			
			/* 클라이언트에서 받는 메세지 */
			byte[] data = new byte[1024];
			int n = is.read(data);
			String message = new String(data,0,n);
			System.out.println(message);
			
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}