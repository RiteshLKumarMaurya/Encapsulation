package practice;

public class B{
	public static void main(String[] args) {
		A r=new A();
		r.setValue(100);
		System.out.println(r.getValue());
	}
}


class A {
	private int value;//0
	
	public  void setValue(int x) {
//		new A().value=x;
		value=x;
	}
	public int getValue() {
		return value;//0
	}
	
}
