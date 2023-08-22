package automation_practise;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class broken {

@Test
public void broken()
{
	
WebDriver driver=new ChromeDriver();


driver.manage().timeouts().pageLoadTimeout(15,
TimeUnit.SECONDS);
try {
	driver.get("https://www.nykaa.com/");
System.out.println("the login page loading within 15s");
}
catch(Exception e) {
System.out.println("the login page is not loading within 15s");
}
driver.close();
	
}


}
