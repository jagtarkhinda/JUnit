
public class CreadiCard {
	String firstName = ""; 
	String lastName = "";
	String cardNumber = "";
	float creditBal = 400;
	
	public CreadiCard(String fname, String lname, String card){
		this.firstName = fname;
		this.lastName = lname;
		this.cardNumber = card;
	}
	
	public float pay(float amount)
	{
		this.creditBal = this.creditBal + amount;
		return creditBal;
	}
	
	public float PayBill(float amount)
	{
		this.creditBal = this.creditBal - amount;
		return this.creditBal;
	}
	
	

}
