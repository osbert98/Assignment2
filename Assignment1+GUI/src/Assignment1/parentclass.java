package Assignment1;



class dateavailable{
	String July="The promotion is starting in July";
	String April="The promotion isis starting in May";
	String May="The promotion is April";
	
	public void price() {
		
		System.out.println("The most luxorious Travelling Package");
	}
}


public class parentclass {
	
	String flight,  money ;

	
	parentclass(){
		
		this.flight= "Malaysia Airlines";
	
		this.money = "Transaction can only be done by cash ,credit card or online bankin";
		
	}
	
		public void printTrans() {
			
			System.out.println("Flight we are using is: "+this.flight);
			System.out.println("Transaction available: "+this.money);
			
		

}
		
}


