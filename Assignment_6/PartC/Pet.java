package Assignment6;

public class Pet {
	private String name;
	private String ownerName;
	private String color;
	protected int sex;
	static final int MALE=1;
	static final int FEMALE=2;
	static final int SPAYED=3;
	static final int NEUTERED=4;
	protected int start_date;
	protected int end_date;
	public Pet (String name, String ownerName, String color){
		this.name=name;
		this.ownerName=ownerName;
		this.color=color;
	} 
	public String getPetName() {
		return this.name;
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	public String getColor() {
		return this.color;
	}
	public void setSex(int sexid) {
		this.sex=sexid;
	}
	public String getSex(){
		if(this.sex==MALE) return "MALE";
		else if(this.sex==FEMALE) return "FEMALE";
		else if(this.sex==SPAYED) return "SPAYED";
		else if(this.sex==NEUTERED)return "NEUTERED";
		else return null;
	}// Should return the string equivalent of the gender, e.g the string “MALE” etc. 
	
	public String toString(){
		return this.getPetName()+" owned by "+this.getOwnerName()+"\nColor: "+this.getColor()+"\nSex: "+this.getSex();
	}// Should return the name, owner’s name, age, color, and gender (use getSex());

}
