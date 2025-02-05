package universitymiami;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollPg {

	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://welcome.miami.edu/");
		driver.manage().window().maximize();
	}
	@Test
	public void scroll(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000);");
		
		
	}
	@Test
	public void click() {
		driver.findElement(By.xpath("//*[@id=\"global_footer\"]/div[1]/div[2]/div[2]/ul/li[1]/a")).click();
	}
}
