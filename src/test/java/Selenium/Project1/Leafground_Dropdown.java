package Selenium.Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_Dropdown {
	
	@Test
	
	void dropp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[text()='Drop down']")).click();
		Select drop = new Select(driver.findElement(By.id("dropdown1")));
		drop.selectByIndex(1);
		Select drop1 = new Select(driver.findElement(By.name("dropdown2")));
		drop1.selectByVisibleText("Appium");
		Select drop2 = new Select(driver.findElement(By.name("dropdown3")));
		drop2.selectByValue("3");
		List<WebElement> gett =driver.findElements(By.xpath("//*[@class='dropdown']/option"));
		System.out.println(gett.size());
		List<WebElement> drop3=driver.findElements(By.xpath("(//*[@class='example'])[6]/select)"));
		System.out.println(drop3.size());
		for (WebElement webElement : drop3) {
			webElement.click();
			
		}
		
	}

}
