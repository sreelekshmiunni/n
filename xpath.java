package seliniumpr1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
WebDriver driver;
@Before
public void openn()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void loginnn()
{
	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("werty");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}
}
