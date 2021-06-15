package Selenium.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_Edit {

	@Test
	
	void editt() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Edit']")).click();
		driver.findElement(By.id("email")).sendKeys("123@mail.com");
		WebElement gettext= driver.findElement(By.xpath("(//*[@name='username'])[1]"));
		String getty = gettext.getAttribute("value");
		System.out.println(getty);
		driver.findElement(By.xpath("(//*[@name='username'])[2]")).clear();
		Boolean ena= driver.findElement(By.xpath("//*[@disabled='true']")).isEnabled();
		System.out.println(ena);
		driver.quit();
	}
}
