package Selenium.Project1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground_Checkbox {

	@Test

	void checkboxes() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[text()='Checkbox']")).click();
		List<WebElement> check= driver.findElements(By.xpath("(//*[@class='example'])[1]/div/input"));
		System.out.println(check.size());
		for (int i = 0; i < check.size(); i++) {
			check.get(i).click();
			Thread.sleep(2000);
			System.out.println(i+" is checkbox selected?"+" "+check.get(i).isSelected());
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		for (WebElement webElement : check) {
			webElement.click();
			Thread.sleep(2000);
			System.out.println("is checkbox selected?"+" "+webElement.isSelected());
		}
		List<WebElement> deselect= driver.findElements(By.xpath("(//*[@class='example'])[3]/div/input"));
		System.out.println(deselect.size());
		 {
			
		}


	}
}

