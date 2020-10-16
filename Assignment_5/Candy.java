
public class Candy extends DessertItem{
	
	private double weight;
	private int price;
	
	public Candy(String name,double weight,int price) {
		this.name=name;
		this.weight=weight;
		this.price=price;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		double cost=weight*price;
		int c;
		if (cost-(int)cost>0.5) c=(int) Math.ceil(cost);
		else c=(int)Math.floor(cost);
		return c;
	}

}
