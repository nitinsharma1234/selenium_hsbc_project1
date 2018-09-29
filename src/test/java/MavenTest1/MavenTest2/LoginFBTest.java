package MavenTest1.MavenTest2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFBTest {
	@Test
	public void Methodlogin()
	{
		String path = System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("geniousnitinsharma@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("N9211420mit@@");
		driver.findElement(By.id("u_0_2")).click();
	}

}
