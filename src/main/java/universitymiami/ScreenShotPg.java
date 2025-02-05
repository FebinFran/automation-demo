package universitymiami;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


	
public class ScreenShotPg {

	EdgeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new EdgeDriver();
		driver.get("https://welcome.miami.edu/");
		driver.manage().window().maximize();
	}
	@Test
	public void screenshot() throws IOException{
			File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(s, new File("C:\\Users\\HP\\Desktop\\HTML Tutorial\\Miami.png"));
			
			WebElement button=driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/div[2]/div"));
			File s2=button.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(s2, new File(".\\ScreenShot\\miami.png"));
	}
	
	
} 
