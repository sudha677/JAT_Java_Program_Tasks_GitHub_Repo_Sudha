package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class EmployeeID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<Integer, String> employeeMap = new TreeMap<>(); 
	        employeeMap.put(102, "Suresh");
	        employeeMap.put(101, "Sudha");
	        employeeMap.put(104, "Sidharth");
	        employeeMap.put(103, "Pooja");

	       	        List<String> names = new ArrayList<>(employeeMap.values());
	        Collections.sort(names);

	     
	        System.out.println("Employees in alphabetical order:");
	        for (String name : names) {
	            System.out.println(name);

	}

	}
}
