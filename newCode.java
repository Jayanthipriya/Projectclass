package adactin.adactin.src.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newCode {
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jayanthi\\eclipse-workspace\\Sampleee\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("jaya");
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("12345");
		WebElement log=driver.findElement(By.id("login"));
		log.click();

		}
}
