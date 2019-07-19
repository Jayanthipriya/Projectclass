package Git;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.LazyList;

public class BranchCreation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayanthi\\eclipse-workspace\\Sampleee\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		WebElement s=d.findElement(By.id("inputValEnter"));
		s.sendKeys("laptop");
		WebElement c=d.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		c.click();
		WebElement cl=d.findElement(By.id("624325181339"));
		cl.click();
		String parent=d.getWindowHandle();
		Set<String> child = d.getWindowHandles();
		for(String x:child)
		{
			if(!x.equals(parent))
			d.switchTo().window(x);
				
		}
		
		WebElement ad=d.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		ad.click();

	
		
		
	}
}
