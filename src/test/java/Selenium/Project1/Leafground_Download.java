package Selenium.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_Download {
	
	@Test
	
	void downloadd() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[text()='DownLoad Files']")).click();
		driver.findElement(By.linkText("Download Excel"));
		
	}

}


/*@Test
public void m1() throws InterruptedException, IOException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/upload.html");
	WebElement x =driver.findElement(By.name("filename"));
	String xx ="/Users/Sudhakar/Downloads/testleaf.xlsx";
	Runtime.getRuntime().exec(xx);
	Thread.sleep(10000);
	driver.quit();
} */
