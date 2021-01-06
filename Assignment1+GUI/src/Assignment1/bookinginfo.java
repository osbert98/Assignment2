package Assignment1;

public class bookinginfo {

	String firstname;
	String lastname;
	String gender;
	String promo;

	bookinginfo (String firstname,String lastname,String gender,String promo){
		this.firstname=firstname;
		this.lastname=lastname;
		this.gender=gender;
		this.promo=promo;
	}
	
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	public void setLastname(String lastname) {
		this.lastname=lastname;
	}
	public void setPromo(String promo) {
		this.promo=promo;
	}
	public void setgend(String gender) {
		this.gender=gender;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public String getGender() {
		return gender;
	}
	public String getPromo() {
		return promo;
	}
	
	public String toString() {
		return "Booking information  : "+firstname+" "+lastname+"\nGender : "+gender+"\nPromo:"+promo;
	}


	
}

