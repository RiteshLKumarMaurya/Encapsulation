package java_bean;

public class CarMain {
	public static void main(String[] args) {
		Car c=new Car();
		String brand=c.getBrand();
		System.out.println("Brand: "+brand);
		
		c.setBrand("Tesla");
		String brand2=c.getBrand();
		System.out.println("Brand2: "+brand2);
		
	}

}
