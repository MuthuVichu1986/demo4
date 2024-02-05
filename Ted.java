package Testing;

import org.testng.annotations.Test;

public class Ted {
	@Test
	public void set() {
		System.out.println("root");
	}
	@Test(priority = -1)

	public void logoutTest() {

	System.out.println("Testcase with negative priority");

	}
	@Test(priority = 1)

	public void cloginTest() {

	System.out.println("Login successful");

	}

	@Test(priority = 2)

	public void bregisterTest() {

	System.out.println("Register successful");

	}
	@Test(priority = 3)

	public void alogoutTest() {

	System.out.println("Logout successful");

	}

	}


