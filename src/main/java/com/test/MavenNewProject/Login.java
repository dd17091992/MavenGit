package com.test.MavenNewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login
{
 WebDriver driver;
 public Login(WebDriver driver2) {
	driver = driver2;
}

public void method() throws InterruptedException
 {
	 driver.findElement(By.xpath("//a[text()='Sign Up Free']")).click();  
	  driver.findElement(By.id("name")).sendKeys("manoj patil");
	  driver.findElement(By.name("email")).sendKeys("vikapatiq@gmail.com");
	  driver.findElement(By.xpath("//*[@placeholder='Mobile']")).sendKeys("9413435778");
	  driver.findElement(By.id("sub_btn_signup")).click();
	  driver.findElement(By.id("otp")).sendKeys("123456");
	  driver.findElement(By.xpath("//button[@class='btn btn-block btn-cta-primary']")).click();
      Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='confirm']")).click();
	  driver.findElement(By.id("password")).sendKeys("lock@313");
	  driver.findElement(By.id("repassword")).sendKeys("lock@313");
	  driver.findElement(By.id("sub_btn_setpass")).click();
	  driver.findElement(By.id("login-mobile")).sendKeys("9413435778");
	  driver.findElement(By.id("login-password")).sendKeys("lock@313");
	  driver.findElement(By.id("sub_btn")).click();
 }
 
 public void method2() throws InterruptedException
 {
	 driver.findElement(By.xpath("//img[@class='img-responsive']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@onclick='orderProduct();']")).click();
	 
	 Select ddown = new Select(driver.findElement(By.id("cmbPlans")));
	 ddown.selectByVisibleText("WELCOMEPLAN");
	 WebElement  xyz=driver.findElement(By.id("qid"));
	 xyz.sendKeys("1");

     Actions ref=new Actions(driver);
     ref.moveToElement(xyz).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	 
	 driver.findElement(By.id("vehicle_0")).sendKeys("mh12nb1514");
	 driver.findElement(By.xpath("//button[@type='button'][@onclick='saveContinueOrder();']")).click();
 }

}
