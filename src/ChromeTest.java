import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "ExternalJars/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println("cdsd");
		
	}

}
