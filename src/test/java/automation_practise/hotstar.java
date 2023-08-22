package automation_practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class hotstar {
@Test
public void movienames() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		WebElement popular = driver.findElement(By.xpath("//a[.='Popular Shows']"));
		
		List<WebElement> movie = driver.findElements(By.xpath("//a[.='Popular Shows']/ancestor::div[@class='container']/following-sibling::div[@class='slider-container']/descendant::a"));
		for (WebElement wb : movie) {
			Actions act = new Actions(driver);
			act.moveToElement(wb);
			String[] str = wb.getAttribute("to").split("/");
			 System.out.println(str[3]);
			 WebDriverWait wait = new WebDriverWait(driver,30);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Popular Shows']/ancestor::div[@class='container']/following-sibling::div[@class='slider-container']/descendant::a")));
			 
			 
		}
	}		
	}
	
	
