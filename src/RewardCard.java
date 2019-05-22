
public class RewardCard extends CreadiCard {

	String Rewardcard = "";
	float rewardPointBal = 0;
	float rewardBal = 400;
	

	public RewardCard(String fname, String lname,String rcard)
	{
		super(fname,lname,rcard);
		
	}
	
	public float pay(float amount)
	{
		this.rewardBal = this.rewardBal + amount;
		return rewardBal;
	}
	
	public float PayBill(float amount)
	{
		this.rewardBal = this.rewardBal - amount;
		this.rewardPointBal = this.rewardPointBal + amount;
		return rewardBal;
	}
	
	public float getRewardPoints()
	{
		return rewardPointBal;
	}
}
