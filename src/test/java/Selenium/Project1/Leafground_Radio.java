package Selenium.Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_Radio {

	@Test

	void buttons() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Radio Button']")).click();
		driver.findElement(By.id("yes")).click();
		List<WebElement> select =driver.findElements(By.xpath("(//*[@class='large-6 small-12 columns'])[2]/label/input"));
		System.out.println(select.size());
		for (int i = 0; i < select.size(); i++) {
			System.out.println(i+" is radio selected?"+" "+select.get(i).isSelected());
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			}
		List<WebElement> rad =driver.findElements(By.xpath("(//*[@class='large-6 small-12 columns'])[3]/input"));
		System.out.println(rad.size());
		int i=41;
		while (i<=20) {		
			driver.findElement(By.xpath("(//*[@class='large-6 small-12 columns'])[3]/input[1]")).click();
			break;
		}
		while(i>40) {
			driver.findElement(By.xpath("(//*[@class='large-6 small-12 columns'])[3]/input[3]")).click();
			break;
		}
	}

}
