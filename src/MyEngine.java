import java.io.*;

public class MyEngine {
	public static void SerialObject(String fileName, Object obj) throws Exception{
		OutputStream os = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(obj);
		oos.close();
		os.close();
	}
	
	public static Object DeSerialObject(String fileName) throws Exception{
		InputStream is = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(is);
		Object obj = ois.readObject();
		ois.close();
		is.close();
		return obj;
	}
}
