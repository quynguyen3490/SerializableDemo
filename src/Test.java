import java.util.*;

public class Test {
	public static void main(String args[]) throws Exception{
		String fileName = "D:\\objects.txt";
		Test t = new Test();
		
		t.WriteObj(fileName);
		t.ReadObj(fileName);
	}
	
	public void WriteObj(String fileName) throws Exception{
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("Quy Nguyen", 26));
		list.add(new User("Sa Nguyen", 26));
		list.add(new User("Thanh Thanh", 22));
		MyEngine.SerialObject(fileName, list);
	}
	
	public void ReadObj(String fileName) throws Exception{
		ArrayList<User> list = (ArrayList<User>) MyEngine.DeSerialObject(fileName);
		for(User u : list){
			System.out.println(u.getName() + "|" + u.getAge());
		}
	}
}
