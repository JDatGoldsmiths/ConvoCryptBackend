import java.io.*;
import java.net.*;
 
class ServerTest
{
	//create function which assigns bubble for two valid clients
	public static void main(String[] argv) throws Exception
	{
		ServerSocket socket1 = new ServerSocket(6789);
		ServerSocket socket2 = new ServerSocket(6790);
   		Socket t = socket1.accept();//wait for client to connect
   		Socket y = socket2.accept();
   		//socket 1
   		InputStream b = t.getInputStream();
   		OutputStream p = t.getOutputStream();
   		//socket 2
   		InputStream e = y.getInputStream();
   		OutputStream q = y.getOutputStream();
   		int c;
   		int d;
   		while((c=b.read())!=-1 && (d=e.read())!=-1) 
   		{
                           	p.write(d);
                            p.flush();	 
                            System.out.print((char) c);
                            System.out.println();
                            q.write(c);
   							q.flush();	 
   							System.out.print((char) d);
   		}
  }
}