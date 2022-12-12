package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Honda {
	@Test
	
	public static void ktm() {
		System.setProperty("webdriver.chrome.driver", "./Test_Library/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.honda2wheelersindia.com/");
			driver.manage().window().maximize();
			driver.quit();
	}


}
