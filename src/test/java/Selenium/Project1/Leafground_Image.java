package Selenium.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_Image {
	
	@Test
	
	void images() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Image']")).click();
		driver.findElement(By.xpath("//*[@src='../images/home.png']")).click();
		driver.navigate().back();
		WebElement image= driver.findElement(By.xpath("(//*[@class='large-6 small-12 columns'])[2]/img"));
		String img = image.getAttribute("src");
		System.out.println(img);
		System.out.println(image.getAttribute("naturalWidth"));
		if (image.getAttribute("naturalWidth").equals("0"));
				
		{
			System.out.println("image is broken");
		}
		//driver.findElement(By.xpath("(//*[@class='large-6 small-12 columns'])[1]/label")).click();
	}

}
