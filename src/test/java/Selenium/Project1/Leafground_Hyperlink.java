package Selenium.Project1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_Hyperlink {
	
	@Test
	
	void hype() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='HyperLink']")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		String redi =driver.findElement(By.partialLinkText("Find where am ")).getAttribute("href");
		System.out.println(redi);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("404")) {
			System.out.println("link is broken");	
		}
		else {
			System.out.println("link is not  broken");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("(//*[text()='Go to Home Page'])[2]")).click();
		driver.navigate().back();
		List<WebElement> totlink = driver.findElements(By.tagName("a"));
		System.out.println(totlink.size());
		for (WebElement webElement : totlink) {
			System.out.println(webElement.getAttribute("href"));
		}
		/*URL url = new URL(totlink);
		HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
		httpURLConnection.setConnectTimeout(3000);
		httpURLConnection.connect();
		//System.out.println(httpURLConnection.getResponseCode());
		if (httpURLConnection.getResponseCode()==404) {
			System.out.println("link is broken");
			
		} else {
			System.out.println("link is not broken");

		} */
		}
		
	}
