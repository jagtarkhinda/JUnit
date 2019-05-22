import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RewardTest {
	
	RewardCard r1 = new RewardCard("Jagtar", "Singh","234567");

	@Test
	void testPay() {
		//testing pay()
		assertEquals(r1.pay(30),430.0,0.1);
		assertEquals(r1.pay(500),930.0,0.1);
		assertEquals(r1.pay(20),950.0,0.1);
	}

	@Test
	void testPayBill() {
		//testing PayBill()
		assertEquals(r1.PayBill(30),370.0,0.1);
		//testing getRewardPoints()
		assertEquals(r1.getRewardPoints(), 30.0,0.1);
		
		//testing phase 2
		assertEquals(r1.PayBill(75),295.0,0.1);
		assertEquals(r1.getRewardPoints(),105.0,0.1);
		
	}
	

}
