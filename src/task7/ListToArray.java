package task7;


import java.util.ArrayList;
import java.util.List;


public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        // Convert List to Array
	        String[] array = list.toArray(new String[0]);

	        // Print Array
	        System.out.println("Converted Array:");
	        for (String item : array) {
	            System.out.println(item);
	        }

	}

}
