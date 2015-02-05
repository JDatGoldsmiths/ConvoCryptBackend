import java.io.*;
import java.net.*;
 
class ClientTest1
{
	public static void main(String[] argv) throws Exception 
	{
		//change to default ip and request port
		//then assigned available port with user
 		Socket s = new Socket("127.0.0.1",6789);
 		OutputStream p = s.getOutputStream();
   		InputStream i = s.getInputStream();
   		InputStreamReader b = new InputStreamReader(System.in); 
   		int c;
   		while((c=b.read())!=-1) 
   		{
   							p.write(c);
                            p.flush();
                            System.out.print((char)i.read());
		}
  }
}