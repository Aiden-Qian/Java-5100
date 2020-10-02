public class Reverse {
	
	public String reverse(String s) {
		String regular ="\\s+";
		String[] s_arr = s.trim().split(regular);
		String result="";
		for(int i=s_arr.length-1;i>=0;i--) {
			result+=s_arr[i]+" ";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse rs=new Reverse();
		String result=rs.reverse(" the  sky  is  blue ");
		System.out.println(result);
		
	}

}
