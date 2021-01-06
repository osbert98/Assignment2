package Assignment1;






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
		class pack{
			String high="Most luxurious";
			String low="Cheap";
			
		}
	
}


