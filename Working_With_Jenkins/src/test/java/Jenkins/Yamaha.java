package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yamaha {
	@Test
	public static void yamaha() {
		System.setProperty("webdriver.chrome.driver", "./Test_Library/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.yamaha-motor-india.com/");
			driver.manage().window().maximize();
			driver.quit();
	}


}
