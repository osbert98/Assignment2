package Assignment1;

public class travelAgent extends parentclass {

	public static void main(String[] args) {
		
		System.out.println("THANK YOU FOR CHOOSING OUR TRAVEL AGENCY");
		System.out.println("");
 
		listofpromo obj=new listofpromo();
	        obj.places();
	       
		japan j = new japan();
		california c = new california();
		
		
		
		c.checkPromo();
		c.printPlace();
		c.printSeason();
		c.setPrice("RM3000");
		c.date();
		c.printTrans();
		
		
		
		
		
		
		System.out.println("The price for the promo is "+c.getPrice());


		j.checkPromo();
		j.printPlace();
		j.printSeason();
		j.printAvailable("July 2021");
		j.setPrice("RM4500");
		j.printTrans();
		
		
		
		System.out.println("The available date for booking is: "+j.getAvailable());
		System.out.println("The price for the promo is "+j.getPrice());


		

		
	
	

}
}
