package java_bean;

public class Main {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.setAge(34);
		int age = s.getAge();
		System.out.println("Age: "+age);
		System.out.println("Age: "+s.getAge());
	}

}
