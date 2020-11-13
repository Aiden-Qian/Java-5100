
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Email {
	private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";
    private String firstName=null;
    private String lastName=null;
    private Scanner myObj=new Scanner(System.in);
    private HashMap<Integer,String> depCode=new HashMap<>();
    private String passWordList=new String("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,0,1,2,3,4,5,6,7,8,9,!,@,#,$,%");
    private String department=null;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	System.out.println("New Worker:"+this.firstName+" "+this.lastName);
    	System.out.println("Department Codes:\n"+"1 for Sales\n" + 
    			"2 for Development\n" + 
    			"3 for Accounting\n" + 
    			"0 for none\n" + 
    			"Enter department code: ");
    	depCode.put(0, "none");
    	depCode.put(1, "sales");
    	depCode.put(2, "dev");
    	depCode.put(3, "acc");
    	int code=myObj.nextInt();
    	this.department=depCode.get(code);
    }

    // Ask for the department
    private String SetDepartment() {
		return department;
	}

    // Generate a random password
    private String randomPassword(int length) {
    	String passWord="";
    	String[] element=this.passWordList.split(",");
    	Random random=new Random();
    	for(int i=0;i<length;i++) {
    		passWord+=element[random.nextInt(40)+0];
    	}
    	return passWord;
    }

	public String showInfo() {
		// TODO Auto-generated method stub
		return "DISPLAY NAME: "+this.firstName+" "+this.lastName+"\n"
		+"DEPARTMENT: "+this.SetDepartment()+"\n"
		+"COMPANY EMAIL: "+this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.SetDepartment()+"."+this.companySuffix+"\n"
		+"PASSWORD: "+this.randomPassword(this.defaultPasswordLength)+"\n"
		+"MAILBOX CAPACITY: "+this.mailboxCapacity+"mb";
	}

}
