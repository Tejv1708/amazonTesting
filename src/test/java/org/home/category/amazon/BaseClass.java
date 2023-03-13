package org.home.category.amazon;

import org.testng.annotations.Test;

public class BaseClass extends Configration {
	@Test
	public void buysProduct() {
		BuyProduct order = new BuyProduct(chromedriver);
		order.clickSignIn();
        order.fillEmail("singhsau17@gmail.com");
        order.clickContinue();
        order.fillPassword("Naruka@123");
        order.clickSubmit();
	}

}
