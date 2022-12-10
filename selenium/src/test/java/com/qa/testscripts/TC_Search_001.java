package com.qa.testscripts;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.SeleniumPages;
public class TC_Search_001 extends TestBase{
	SeleniumPages tool;
	@Test
	public void Search() throws InterruptedException
	{
		tool=new SeleniumPages(Driver);
		tool.Search().sendKeys("Selenium");
		Thread.sleep(5000);
		System.out.println(SeleniumPages.DropDown.getText());
		
	}
}
