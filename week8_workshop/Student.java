package week8_workshop;

public class Student {
	String name;
	int age;
	
	public Student(String n, int a){
		this.name = n;
		this.age = a;
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void setName(String n) {
		this.name = n;
		System.out.println("New Name :" + age);
	}
	
	void setAge(int a) {
		this.age = a;
		System.out.println("New Age :" + age);
	}
}



