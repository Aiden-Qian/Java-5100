public class Test {
	
	
	public static void main(String[] args) {
		Student[] List=new Student[10];
		Student A=new Student("a",12);
		Student B=new Student("b",13);
		Student C=new Student("c",14);
		Student D=new Student("d",15);
		Student E=new Student("e",16);
		Student F=new Student("f",17);
		Student G=new Student("g",18);
		Student H=new Student("h",20);
		Student I=new Student("i",21);
		Student J=new Student("j",22);
		Student K=new Student("k",23);
		
		Course java=new Course();
		java.title("Java");
		
		java.registerStudent(A);
		java.registerStudent(B);
		java.registerStudent(C);
		java.registerStudent(D);
		java.registerStudent(E);
		java.registerStudent(F);
		java.registerStudent(G);
		java.registerStudent(H);
		java.registerStudent(I);
		java.registerStudent(J);
		java.registerStudent(K);
		
		System.out.println(java.getNumber());
		
		List=java.getStudents();
		
		for(int i=0;i<java.getStudents().length;i++) {
			System.out.print(List[i].getName()+", ");
		}
		
		
	}

}
