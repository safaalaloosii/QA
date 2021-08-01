package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;

    private Driver(){
    }

    public static WebDriver getDriver(){

        if(driver==null){
            String browser = ConfigurationReader.getProperties("browser");
            switch (browser.toLowerCase()){

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS); break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS); break;


            }

        }

        return driver;
    }

    public static void closeDriver(){

        if(driver!=null){
            driver.close();
            driver = null;
        }
    }
}
