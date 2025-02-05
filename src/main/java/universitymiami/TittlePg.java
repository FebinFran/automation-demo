package universitymiami;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TittlePg {

	EdgeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new EdgeDriver();
		driver.get("https://welcome.miami.edu/");
		driver.manage().window().maximize();
	}
	@Test
	public void title() {
		String title=driver.getTitle();
		System.out.println(""+title);
		String 	exptitle="University of Miami";
		if(title.equals(exptitle))
		{
			System.out.println("Title Verified");
		}
		else
		{
			System.out.println("Title Not Verified");
		}
	}
}
