package practice;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(1010);
		e.setName("Ritesh Kumar Maurya");
		e.setMgr(1838);
//		e.setDeptno();
		
		System.out.println("id: "+e.getId());
		System.out.println("name: "+e.getName());
		System.out.println("mgr: "+e.getMgr());
		
	}
}
