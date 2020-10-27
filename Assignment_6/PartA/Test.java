public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mreview Marvel=new Mreview("Avenger");
		Marvel.addRating(3);
		Marvel.addRating(4);
		Marvel.addRating(5);
		System.out.println("AveRating: "+Marvel.aveRating());
		System.out.println(Marvel.toString());
	}

}
