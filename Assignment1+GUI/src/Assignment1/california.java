package Assignment1;

import java.util.Scanner;

public class california extends parentclass {
		
	    String placename,season,date;
	    String price;
	 
	    
	    california(){
	        this.placename="California";
	        this.season="Summer";
	        this.date="Available in July";
	    }
	    public void printPlace(){
	        california c=new california();
	        System.out.println("Place we have in promo: "+c.placename);
	    }
	    public void printSeason(){
	        california c1=new california();
	        System.out.println("The season for places is : "+c1.season);
	    }
	    public void date(){
	        california c2=new california();
	        System.out.println("Date availability: "+c2.date);
	    }
	    
	    public void setPrice(String myprice){
	        price=myprice;
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
	    
		}   
	    
	    class pricepackage extends pack{ 

	    	String med = "Most affordable";
			public void display() {
				System.out.println("The package you have choosen is : " +med);
			}
	    
	
	    	
			public void printPack() {
				
			pricepackage p = new pricepackage();
		
			p.display();
			
	    }
	    }
}
	    
	    

	    
	    
	