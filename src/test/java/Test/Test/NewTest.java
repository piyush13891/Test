package Test.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "geckodriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching firefox browser"); 
      //System.setProperty("webdriver.firefox.marionette", driverPath);
     // driver = new FirefoxDriver();
     // driver.get(baseUrl);
      //String expectedTitle = "Welcome: Mercury Tours";
     // String actualTitle = driver.getTitle();
      ////Assert.assertEquals(actualTitle, expectedTitle);
     // driver.close();
  }
}
