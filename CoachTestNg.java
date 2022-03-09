package testNgPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CoachTestNg {
	
	WebDriver driver;
	
	@Test(priority = 1)
	
		public void coachLogin() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vinay/Desktop/Testing/chromedriver");
    	driver = new ChromeDriver();
    	
    	driver.get("https://www.coach--outlet.com/");
    	driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul[2]/li/a[1]")).click();
    	
    	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/button")).submit();
    	//driver.close();
    	
	}
	
	@Test(priority = 2)
	
		public void coachShopping() throws InterruptedException {
		
		// Select Backpack
    	driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul[1]/li[2]/a")).click();
    	Thread.sleep(2000);
    	
    	//Select sortBy = new Select(driver.findElement(By.xpath("//*[@id=\"grid-sort-header\"]")));
    	//sortBy.selectByVisibleText("Lowest Price");
    	
    	driver.findElement(By.xpath("//*[@id=\"search-result-items\"]/li[2]/div/div[2]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"add-to-bag\"]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"shoppingCartDefault\"]/form/div[5]/a/button")).click();
    	Thread.sleep(2000);
    	
    	// Select Sunglasses
    	driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul[1]/li[7]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"search-result-items\"]/li[14]/div/div[2]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"add-to-bag\"]")).click();
    	Thread.sleep(2000);
    	
    	// Update cart quantity in bag
    	WebElement cartQuantity = driver.findElement(By.name("cart_quantity[]"));
    	cartQuantity.clear();
    	Thread.sleep(2000);
    	cartQuantity.sendKeys("3");
    	Thread.sleep(2000);
    	
    	// Mouse over on crossbody bags
    	
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul[1]/li[8]/a"));
    	Actions action = new Actions(driver);
    	action.moveToElement(element).build().perform();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul[1]/li[8]/div/div/div/div/ul/li[5]/a")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id=\"search-result-items\"]/li[6]/div/div[2]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"add-to-bag\"]")).click();
    	
    	// Checkout
    	
    	driver.findElement(By.xpath("//*[@id=\"shoppingCartDefault\"]/form/div[4]/a/button")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id=\"comments\"]/textarea")).sendKeys("Giftbox the madison crossbody bag");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"checkoutShipping\"]/form/div[4]/button")).submit();
    	
    	// close
    	//driver.close();
    	
    	
    	
	}
		
	
	@Test(priority = 3)
	
		public void clearTheCart() throws InterruptedException {
		
		
    	//Clear the cart
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//use implicit wait
		driver.findElement(By.className("icon")).click();
		
    	//driver.navigate().to("https://www.coach--outlet.com/shopping_cart.html");
    	driver.findElement(By.xpath("//*[@id=\"cartContentsDisplay\"]/tbody/tr[4]/td[6]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"cartContentsDisplay\"]/tbody/tr[3]/td[6]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"cartContentsDisplay\"]/tbody/tr[2]/td[6]/a")).click();
    	Thread.sleep(2000);
    	
    	// Sign out
    	driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul[2]/li/a[2]")).click();
    	Thread.sleep(2000);
    	//driver.close();
		
	}
	
	
	
	

}
