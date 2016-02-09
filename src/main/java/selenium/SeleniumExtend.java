package selenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class SeleniumExtend extends SeleniumTest{
	@Test
	public void TestPaytm(){
		driver.navigate().to("https://paytm.com");
		driver.findElement(By.xpath(".//*[@id='user-detail']/div/div[3]/div[3]/div/span/a[1]")).click();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath(".//*[@id='input_0']")).sendKeys("9410216600");
		driver.findElement(By.xpath(".//*[@id='input_1']")).sendKeys("akshay@1993");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/md-content/button[1]")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='radio_3']/div[1]/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id='input_4']")).sendKeys("8586925453");
		driver.findElement(By.xpath(".//*[@id='input_5']")).sendKeys("Vodafone");
		driver.findElement(By.xpath(".//*[@id='input_7']")).sendKeys("500");
		driver.findElement(By.xpath(".//*[@id='recharge']/div[2]/button")).click();
		driver.findElement(By.xpath(".//*[@id='couponsDetails']/div/ul/li[1]/div/a")).click();
		driver.findElement(By.xpath("..//*[@id='input_38']")).sendKeys("EOM65");
		driver.findElement(By.xpath(".//*[@id='couponsDetails']/div/ul/li[3]/button")).click();
		driver.findElement(By.xpath(".//*[@id='paymentBox']/div[6]/form/div/input")).click();

		
		
		
		
	}
}
