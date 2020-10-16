
public class Sundae extends IceCream{
	private int topping;
	private String taste;
	
	public Sundae(String name, int cost, String taste, int topping) {
		// TODO Auto-generated constructor stub
		super(name, cost);
		this.taste=taste;
		this.topping=topping;
	}

	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		int cost=super.getCost()+this.topping;
		return cost;
	}
}
