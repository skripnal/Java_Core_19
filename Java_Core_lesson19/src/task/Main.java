package task;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args){
		
		Employee obj = new Employee();
		obj.setName("Oleksandr");
		obj.setId(1);
		obj.setSalary(40000);
		
		File file = new File("serializable.txt");
		try {
			Methods.serialize(file, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Methods.deserialize(file));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(obj);
		list.add(new Employee());
		
		File file2 = new File("serializableList.txt");
		try {
			Methods.serializeList(file2, list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Methods.deserializeList(file2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
