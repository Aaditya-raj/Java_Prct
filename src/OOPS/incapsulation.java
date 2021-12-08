package OOPS;

class Furniture
{
public double length=100.00;
public double width=200.00;
public double height=300.00;

public void volume()
{
	double vol =  length*width*height;
	
	System.out.println("volume is: "+ vol);
}
}

public class incapsulation {
	
	

	public static void main(String[] args) {
		
		Furniture chair = new Furniture();
		
		chair.volume();

	}

}
