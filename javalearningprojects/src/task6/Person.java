package javalearningprojects.src.task6;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main (String Arr[]) {
		
		Person p = new Person("Sudha", 34);
		
		System.out.println(p.name);
		System.out.println(p.age);
		
	}

}
