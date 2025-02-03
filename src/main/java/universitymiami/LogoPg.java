package universitymiami;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogoPg {

	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://welcome.miami.edu/");
		driver.manage().window().maximize();
	}
	@Test
	public void logo() {
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"alertbanner\"]/div[1]/div[1]/span/img"));
		boolean l=logo.isDisplayed();
		if(l)
		{
			System.out.println("Logo is Present");
		}
		else {
			System.out.println("Logo is not Present");
		}
	}
}
