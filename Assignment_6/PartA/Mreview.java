import java.util.ArrayList;

public class Mreview implements Comparable<Mreview>
{
  // instance variables
  private String title;   // title of the movie
  private ArrayList<Integer> ratings; // list of ratings stored in a Store object
  
  public Mreview() {
	  this.title="";
	  this.ratings=new ArrayList<>();
  }
  
  public Mreview(String title) {
	  this.title=title;
	  this.ratings=new ArrayList<>();
  }
  
  public Mreview(String title, int first_ratings) {
	  this.title=title;
	  this.ratings.add(first_ratings);
  }
  
  public String getTitle() {
	  return this.title;
  }
  
  public void addRating(int r) {
	  this.ratings.add(r);
  }
  
  public double aveRating() {
	  double total_ratings=0;
	  for(int i=0;i<ratings.size();i++) {
		  total_ratings+=ratings.get(i);
	  }
	  return total_ratings/ratings.size();
  }
  
  public int numRatings() {
	  return ratings.size();
  }
  
  public boolean equals(Mreview o) {
	  if(this.title==o.title) return true;
	  return false;
  }
  
  public String toString() {
	  return this.title+", average "+ this.aveRating()+" out of "+this.numRatings()+" ratings";
  }
  
@Override
public int compareTo(Mreview o) {
	// TODO Auto-generated method stub
	return this.title.compareTo(o.title);
}

  // methods
}

