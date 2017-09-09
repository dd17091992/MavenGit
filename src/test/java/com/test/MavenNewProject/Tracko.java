package com.test.MavenNewProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Tracko
{ 

  WebDriver driver ;
  @Parameters("browser")
  @BeforeTest
  public void beforeTest(String bro)
  {
     System.out.println("signup"+bro);  
    
    if (bro.equals("chrome"))
   	{
      System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
   	  driver = new ChromeDriver();
   	 
   }
   	 else if (bro.equals("firefox")) 
   	{
   	  System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
   	  driver = new FirefoxDriver();
   	  
   	}
   	 else if (bro.equals("IE")) 
   	{
   	  System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
   	  driver = new InternetExplorerDriver();
   	 
   	}
   	 
   	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
   	  driver.navigate().to("https://dev.tracko.co.in/");
//  	 driver.manage().window().maximize();
  }
  
  @Test
  public void signup() throws InterruptedException
  {
    System.out.println("Signup");
    
    Login ref = new Login(driver);
    ref.method();
    ref.method2();
    
  }
  
  @Test
  public void login()
  {
	  
  }

  @AfterTest
  public void afterTest()
  {
//	driver.quit();
  }

}
