package org.home.category.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Configration {

	WebDriver chromedriver;

	@BeforeClass
	public void startDriver() throws InterruptedException {
		chromedriver = new ChromeDriver();
		chromedriver.get("https://www.amazon.in/");
		chromedriver.manage().window().fullscreen();
		chromedriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void closeDriver() {
		chromedriver.close();
}
}
