package Assignment1;



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
	
		}   
	    
	    
	    

	    
	    
	