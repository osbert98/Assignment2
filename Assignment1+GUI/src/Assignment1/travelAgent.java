package Assignment1;

public class travelAgent extends parentclass {

	public static void main(String[] args) {
		
		listpromo a=new listpromo();
 
		
		japan j = new japan();
		california c = new california();
		
		
		c.printPlace();
		c.printSeason();
		c.printAvailable("1 June 2021 until 31 August");
		c.setPrice("RM3000");
		System.out.println("The available date for booking is: "+c.getAvailable());
		System.out.println("The price for the promo is "+c.getPrice());

		
		j.printPlace();
		j.printSeason();
		j.printAvailable("1 May 2021");
		j.setPrice("RM3000");
		System.out.println("The available date for booking is: "+j.getAvailable());
		System.out.println("The price for the promo is "+j.getPrice());
	}
		
	
	

}
