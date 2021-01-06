package Assignment1;

public class california {

	 	String placename,	season;
	    String price;
	    private String available;
	    
	    california(){
	        this.placename="California";
	        this.season="Spring";
	     
	    }
	 
	    public void printPlace(){
	        promopackage a = new promopackage();
	        System.out.println();
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
	}


