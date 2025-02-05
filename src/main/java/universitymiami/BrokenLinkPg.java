package universitymiami;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrokenLinkPg {

	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://welcome.miami.edu/");
		driver.manage().window().maximize();
	}
	@Test
    public void BrokenLink() throws IOException {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found:" + links.size());
        boolean brokenLinkFound = false;
        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url != null && !url.isEmpty()) {
                int responseCode = getResponseCode(url);

                if (responseCode >= 400) {
                    System.out.println(url + " is BROKEN. Response Code: " + responseCode);
                    brokenLinkFound = true;
                } else {
                    System.out.println(url + " is No ERROR.");
                }
            }
        }
        if (brokenLinkFound) {
            System.out.println("Broken links are present on the webpage.");
        } else {
            System.out.println("No broken links found.");
        }
    }
	 private int getResponseCode(String url) {
	 return 0; 
	}
}
