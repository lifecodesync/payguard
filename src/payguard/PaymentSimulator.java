package payguard;

import java.math.BigDecimal;

public class PaymentSimulator {
	

	public static void main(String[] args) {
		Payment a = new Payment(new BigDecimal("750"));
		Payment b = new Payment(new BigDecimal("0"));
		Payment c = new Payment(new BigDecimal("-50"));
		a.process();
		b.process();
		c.process();
		Payment d = new Payment(new BigDecimal("0.01"));
		Payment e = new Payment(new BigDecimal("750.50"));
		d.process();
		e.process();
		
		
	}

}
