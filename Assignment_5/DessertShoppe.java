
public class DessertShoppe {
	private double rate=0.065;
	private String name="M & M Dessert Shoppe";
	private int max;
	private int width;
	
	public DessertShoppe() {}
	
	public String getName() {
		return this.name;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public int getMax() {
		return this.max;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public String cents2dollarsAndCents(int cents) {
		double dollar=(cents%100)*0.01+cents/100;
		return String.valueOf(dollar);
	}
}
