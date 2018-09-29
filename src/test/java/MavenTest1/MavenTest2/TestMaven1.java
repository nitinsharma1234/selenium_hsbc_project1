package MavenTest1.MavenTest2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMaven1 {
	@Test
		public void method(){
		String path = System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",path );
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.com");
		}
	}


     