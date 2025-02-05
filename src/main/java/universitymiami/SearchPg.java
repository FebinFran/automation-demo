package universitymiami;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchPg {

	EdgeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new EdgeDriver();
		driver.get("https://welcome.miami.edu/");
		driver.manage().window().maximize();
	}
	@Test
	public void search() {
		driver.findElement(By.xpath("//*[@id=\"sliverRightSearch\"]")).sendKeys("Java programmer");
		driver.findElement(By.xpath("//*[@id=\"sliverRightSearch\"]")).submit();
		driver.findElement(By.xpath("//*[@id=\"accessibility-content\"]/div[1]/ul/li[3]/a")).click();

	}
}
