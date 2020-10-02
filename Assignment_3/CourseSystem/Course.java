public class Course {
	private String name;
	private Integer numberOfStudent=0;
	private Integer maximum =10;
	private Student[] studentList=new Student[maximum];
	
	public void title(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getNumber() {
		return numberOfStudent;
	}
	
	public Student[] getStudents() {
		return studentList;
	}
	
	
	
	public boolean isFull() {
		if(studentList[9]==null) {
			return false;
		}
		else return true;
	}
	
	public void registerStudent(Student student) {
		if(isFull()) System.out.println("isFull");
		else {
			for(int i=0;i<maximum;i++) {
				if(studentList[i]==null) {
					studentList[i]=new Student(student.getName(),student.getId());
					++numberOfStudent;
					break;
				}
			}
		}
	}
	
}
