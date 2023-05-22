package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base1 {
	public static String URl = "https://www.amazon.com";
	public static WebDriver driver;

	@BeforeTest
	
	public static void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URl);
	}

	@AfterTest
	public static void end() {
		driver.close();
	}

}
