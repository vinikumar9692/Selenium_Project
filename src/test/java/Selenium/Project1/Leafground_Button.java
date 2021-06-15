package Selenium.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_Button {

	@Test
	
	void buttons() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[text()='Button']")).click();
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		Point pos= driver.findElement(By.id("position")).getLocation();
		System.out.println(pos.getX()+" "+pos.getY());
		String col =driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(col);
		String hex = Color.fromString(col).asHex();
		System.out.println(hex);
		Dimension siz =driver.findElement(By.id("size")).getSize();
		System.out.println(siz.getHeight()+" "+siz.getWidth());
		
		
	}
}
