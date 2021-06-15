package Selenium.Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_Table {
	
	@Test
	
	void tablee() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Table']")).click();
		List<WebElement> header=driver.findElements(By.tagName("th"));
		System.out.println(header.size());
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		String prog= driver.findElement(By.xpath("//tr[3]/td[2]")).getText();
		System.out.println(prog);
		driver.findElement(By.xpath("//tr[4]/td[3]")).click();
	}
	

}
