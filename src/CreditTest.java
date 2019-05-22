import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreditTest {
	
	CreadiCard c1 = new CreadiCard("Jagtar", "Singh","12345");

	@Test
	void testPay() {
		
		assertEquals(c1.pay(50),450.0,0.01);
		
	}

	@Test
	void testPayBill() {
		assertEquals(c1.PayBill(50),350.0,0.1);
		
	}

}
