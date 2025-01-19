package baseclasspackage;

import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoBaseClass {
	ChromeDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
	}
}
