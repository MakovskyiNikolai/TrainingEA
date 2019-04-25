import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static Locators.MainPage.loginWithPopUp;

public class TestSuiteEA {

  private WebDriver driver;


  @Before
  public void setDriver(){
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @After
  public void driverClose(){
    driver.close();
  }

  @Test
  public void checkCRMMainPageIsOpened(){
       loginWithPopUp(driver, "rmishyn", "!123456789", "us01.dynamicseam.com");
      }

}
