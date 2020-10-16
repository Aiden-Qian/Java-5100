
import java.util.Vector;
import java.util.stream.Collectors;

public class Checkout {
	
	Vector<DessertItem> DessertList;
	DessertShoppe shop=new DessertShoppe();
	
	public Checkout() {
		 this.DessertList=new Vector<DessertItem>();
	}
	
	public int numberOfItems() {
		return this.DessertList.size();
	}
	
	public void enterItem(DessertItem item) {
		this.DessertList.addElement(item);
	}
	
	public void clear() {
		this.DessertList.clear();
	}
	
	public int totalCost() {
		int cost=0;
		for(int i=0;i<this.DessertList.size();i++) {
			cost+=this.DessertList.elementAt(i).getCost();
		}
		return cost;
	}
	
	public int totalTax() {
		int tax=0;
		for(int i=0;i<this.DessertList.size();i++) {
			tax+=this.DessertList.elementAt(i).getCost()*shop.getRate();
		}
		return tax;
	}
	
	public static String print(DessertItem item) {
		return item.getName()+"   "+item.getCost();
	}
	
	public String toString() {
		String receipt="";
		for(int i=0;i<this.DessertList.size();i++) {
			String cost=shop.cents2dollarsAndCents(this.DessertList.elementAt(i).getCost());
			receipt+=this.DessertList.elementAt(i).getName()+"    "+cost+"\n";
		}
	
		return shop.getName()+"\n------------------\n"+receipt+"\n"+"Tax "+shop.cents2dollarsAndCents(totalTax())+"\n"+"Total Cost "+shop.cents2dollarsAndCents(totalCost()+totalTax());
	}

}
