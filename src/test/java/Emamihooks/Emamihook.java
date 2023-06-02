package Emamihooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Emamihook {
	@Before
	public void beforeSnapping() {
		System.out.println("Use Mobile number to login and Initate the payment");
	}
@After
	public void afterSnapping() {
	System.out.println("Payment successfully");

}

}
