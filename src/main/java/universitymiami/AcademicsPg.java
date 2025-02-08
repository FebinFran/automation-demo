package universitymiami;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AcademicsPg {
EdgeDriver driver;
@BeforeTest
public void setUp() {
	driver=new EdgeDriver();
	driver.get("https://welcome.miami.edu/");
	driver.manage().window().maximize();
}
@Test
public void academic() {
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/div[3]/div[2]/div[1]/a/span")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/ul[1]/li[1]/a")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/section/div/div/div[10]/div/div/h3/a/span")).click();
}
}
