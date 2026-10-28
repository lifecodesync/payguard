package payguard;

import java.math.BigDecimal;
public class Payment {
	BigDecimal amount;
	Payment(BigDecimal amount){
		this.amount = amount;
		
	}
	void process() {
	    if (amount.compareTo(BigDecimal.ZERO) > 0) {
	        System.out.println("Payment of Rs. " + amount + " Received");
	    } else {
	        System.out.println("Rejected: amount must be positive");
	    }
	}

}
