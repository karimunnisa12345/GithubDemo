package myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\karimun1\\Demo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
}
