package task;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Employee obj = new Employee();
		obj.setName("Oleksandr");
		obj.setId(1);
		obj.setSalary(40000);
		
		File file = new File("serializable.txt");
		Methods.serialize(file, obj);
		System.out.println(Methods.deserialize(file));
		
		System.out.println();
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(obj);
		list.add(new Employee());
		
		File file2 = new File("serializableList.txt");
		Methods.serializeList(file2, list);
		System.out.println(Methods.deserializeList(file2));
	}

}
