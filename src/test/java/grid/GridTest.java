package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
    
	public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub
        
        DesiredCapabilities Cap = new DesiredCapabilities();
        Cap.setPlatform(Platform.WINDOWS);
        Cap.setBrowserName("chrome");
        
        URL HubURL = new URL("http://localhost:4444/wd/hub");
        
        WebDriver driver = new RemoteWebDriver(HubURL,Cap);
        
        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        driver.close();  
        
        }
	

}
