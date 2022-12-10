package com.qa.testscripts;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.pages.SeleniumPages;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {
	SeleniumPages page;
	WebDriver Driver;
	@Parameters({"Browser","Url"})
	 @BeforeClass
	 public void Setup(String Browser,String Url)throws IOException
	 {	 
	 if(Browser.equalsIgnoreCase("Chrome"))
	 {
	 WebDriverManager.chromedriver().setup();
	 Driver=new ChromeDriver();
	 }
	 else if(Browser.equalsIgnoreCase("firefox"))
	 {
	 WebDriverManager.firefoxdriver().setup();
	 Driver=new FirefoxDriver();
	 }
	 else if(Browser.equalsIgnoreCase("edge")) {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\abirami s s\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
	      Driver=new EdgeDriver();
	 }
	 page=new SeleniumPages(Driver);
	 Driver.manage().window().maximize();
	 Driver.get(Url);
	 }
	 @AfterClass public void TearDown() throws InterruptedException 
	 {
	 Thread.sleep(5000);
	 Driver.close();
	 }
}
