package universitymiami;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StringPresentPg {

	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://welcome.miami.edu/");
		driver.manage().window().maximize();
	}
	@Test
	public void present(){
		String pagesource=driver.getPageSource();
		if(pagesource.contains("Admission"))
		{
			System.out.println("String is Present");
		}
		else
		{
			System.out.println("String is not Present");
		}
	}
}
