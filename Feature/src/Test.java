
public class Test {

	
	public static void main(String[] args) {
		System.out.println("this was eclipse file from application...");
		
		Student student = new Student();
		student.setId(101);
		student.setName("ganesh");
		student.setAddress("pune");
		
		System.out.println(student.getId()+" "+student.getName()+" "+student.getAddress());
		
	}
}
