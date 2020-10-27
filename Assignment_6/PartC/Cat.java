public class Cat extends Pet implements Boardable{
	
	private String hairLength;
	
	public Cat (String name, String ownerName, String color, int sexid,String hairLength) {
		super(name,ownerName,color);
		this.hairLength=hairLength;
		super.setSex(sexid);
	}
	
	public String getHairLength(){
		return this.hairLength;
	}// returns the string hairLength
	
	public String toString() {
		return "CAT:\n"+super.toString()+"\nHair: "+this.hairLength;
	}
	/* method that returns a String that identifies the pet as Cat and returns a complete description of the cat, including the values stored in the Pet parent class.*/


	@Override
	public void setBoardStart(int month, int day, int year) {
		// TODO Auto-generated method stub
		super.start_date=year*10000+month*100+day;
		
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		// TODO Auto-generated method stub
		super.end_date=year*10000+month*100+day;
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		// TODO Auto-generated method stub
		int curr_date=year*10000+month*100+day;
		if((curr_date<super.end_date&&curr_date>super.start_date)||curr_date==super.end_date||curr_date==super.start_date) return true;
		return false;
	}

}
