
public class Test {

	
	public static void main(String[] args) {
		System.out.println("this was eclipse file from application...");
		
		Student student = new Student();
		student.setId(101);
		student.setName("ganesh");
		student.setAddress("pune");
		
		System.out.println(student.getId()+" "+student.getName()+" "+student.getAddress());
		
		Employee1 employee1= new Employee1();
		employee1.setId(123);
		employee1.setName("ganu");
		employee1.setAddress("pune");
		
		System.out.println("data of employee "+employee1);
		
		if(10>0) {
			System.out.println("10 is greather");
		}
		
	}
}
