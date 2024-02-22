package seldocker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
/**
 * @author CHIRAG
 *
 */
public class ChromeTest {
	
	public static void main(String[] args) throws MalformedURLException {
		new DesiredCapabilities();
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		@SuppressWarnings("deprecation")
		URL url = new URL("http://127.0.0.1:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
