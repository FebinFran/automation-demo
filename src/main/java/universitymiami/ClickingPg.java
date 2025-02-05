package universitymiami;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickingPg {

	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://welcome.miami.edu/");
		driver.manage().window().maximize();
	}
	@Test
	public void clicking() {
	  driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/div[3]/div[2]/div[2]/a/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"global_footer\"]/div[1]/div[2]/div[3]/ul/li[8]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"typehead\"]")).sendKeys("Software Tester");
	  driver.findElement(By.xpath("//*[@id=\"gllocationInput\"]")).sendKeys("Kechi, kansas, united states");
	  driver.findElement(By.xpath("//*[@id=\"ph-search-backdrop\"]/span")).click();
   }
}
