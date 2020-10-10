public class Cylinder extends Circle{
	
	private double height=1.0;
	
	public Cylinder() {
		System.out.println("height="+height);
	}
	
	public Cylinder(double height) {
		this.height=height;
	}
	
	public Cylinder(double height, double radius) {
		this.height=height;
		this.setRadius(radius);
	}
	
    public Cylinder(double height, double radius, String color) {
		this.height=height;
		this.setRadius(radius);
		this.setColor(color);
	}
    
    public double getHeight() {
    	return height;
    }
    
    public void setHeight(double height) {
    	this.height=height;
    }
    
    public double getArea() {
		return 2*3.14*this.getRadius()*(this.getRadius()+this.height);
    	
    }
    
    public double getVolume() {
    	return super.getArea()*this.height;
    }
}
