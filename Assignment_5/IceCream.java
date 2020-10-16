package Assignment5;

public class IceCream extends DessertItem{
	
	private int cost;
	
	public IceCream(String name, int cost) {
		this.name=name;
		this.cost=cost;
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

}
