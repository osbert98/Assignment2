package Assignment1;

import java.util.Scanner;



public class japan extends parentclass {
	
	
		
		String placename,	season;
	    String price;
	    private String available;
	    
	    japan(){
	        this.placename="Japan";
	        this.season="SakuraSeason";
	     
	    }
	 
	    public void printPlace(){
	    	
	        japan a = new japan();
	        System.out.println("");
	        System.out.println("Amazing place we have in promo: "+a.placename);
	    }
	    public void printSeason(){
	    	promopackage a = new promopackage();
	        System.out.println("Season of the month is : "+a.season);
	    }

	    
	    public void printAvailable(String date){
	        available=date;
	    }
	    public String getAvailable(){
	        return available;
	    }
	    public void setPrice(String newPrice){
	        price=newPrice;
	    }
	    public String getPrice(){
	        return price;
	    }
	    public void checkPromo(){
	        Scanner scan1=new Scanner(System.in);
	        try{
	            System.out.println("Type to check Promo place availability: ");
	            String place=scan1.next();
	            System.out.println("Choosen promo places: "+place);
	            System.out.println("");
	        } catch(Exception e){
	            System.out.println("Something went wrong! place is not available");
	        }
	    
	    
	    class pricepackage extends pack{ 

			public void display() {
				System.out.println("The package you have choosen is : " +high);
			}
	    
	
	    	
			public void printPack() {
				
			pricepackage p = new pricepackage();
			p.display();
	    }
			
			
	    }
	    }
}
	

