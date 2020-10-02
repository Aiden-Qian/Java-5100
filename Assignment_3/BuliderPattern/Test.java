public class Test {

	public static void main(String[] args) {
        Professor professor = new Professor.Builder("Emma", "Wang",9906).build();
        
        System.out.println(professor.getId());
    }

}
