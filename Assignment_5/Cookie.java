
public class Cookie extends DessertItem{
	
	private int number;
	private int price;
	
	public Cookie(String name,int number, int price) {
		this.name=name;
		this.number=number;
		this.price=price;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		int cost=(int)(number*price/12);
		return cost;
	}

}
