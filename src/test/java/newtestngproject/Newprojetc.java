package newtestngproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Newprojetc {

	
	public static ChromeOptions options;

	public static WebDriver driver;
		
	@Test
	public void test1() {
		
		options = new ChromeOptions();

		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		
		 
		 driver.get("https://www.google.com/");
		 driver.quit();	}	
	
		
		

	
}
