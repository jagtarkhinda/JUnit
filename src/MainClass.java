
public class MainClass {
	
	
	public static void main(String args[])
	{
		CreadiCard c1 = new CreadiCard("Jagtar", "Singh","12345");
		
		System.out.println("New Credit Card balance " + c1.pay(30));
		System.out.println("New Credit Card balance " + c1.PayBill(20));
		
		RewardCard r1 = new RewardCard("Jagtar", "Singh","234567");
		System.out.println("New Reward Card balance " + r1.pay(50));
		System.out.println("New Reward Card balance " + r1.PayBill(50));
		
	}

}
