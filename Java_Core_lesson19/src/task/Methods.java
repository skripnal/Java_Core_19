package task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;

public class Methods {
	
	public static void serialize(File file, Serializable object) throws Exception {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(object);
		oos.close();
		os.close();
	}
	
	public static Serializable deserialize(File file) throws Exception {
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Serializable object = (Serializable)ois.readObject();
		is.close();
		ois.close();
		return object;
	}
	
	public static void serializeList(File file, List<Employee> list) throws Exception {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(list);
		oos.close();
		os.close();
	}
	
	public static List<Employee> deserializeList(File file) throws Exception{
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		List<Employee> list = (List<Employee>)ois.readObject();
		is.close();
		ois.close();
		return list;
	}
}
