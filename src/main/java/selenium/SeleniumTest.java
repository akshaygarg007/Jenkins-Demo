package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class SeleniumTest 
{
	WebDriver driver = new FirefoxDriver ();
                        
//    WebDriver driver = new InterOOnetExplorerDriver();
//    WebDriver driver = new ChromeDriver();

    public WebDriverWait wait = new WebDriverWait(driver, 30);
    public void sleep(){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
    
    public void Longsleep(){
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     }
    
     /**
      * Initializes Selenium
      */
     @Before
     public void setupSelenium()
     {
         driver.manage().window().maximize();
     }

     /**
      * Cleans up Selenium resources
      */
     @After
     public void closeSelenium()
     {
         driver.close();
         driver.quit();
     }
     
     public void captureScreenShot(String filename) throws IOException
     {
         File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
         FileUtils.copyFile(scrFile, new File("/home/akshay/selenium/" + filename + ".png"));
     }
     
}