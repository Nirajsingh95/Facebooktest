package com.selenium.script.Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{	@Test
    public static void main( String[] args ) throws InterruptedException
    {
       
	
		System.setProperty("webdriver.chrome.driver","C:\Users\niraj\Downloads\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("nirajs712884@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.name("loginbutton")).click();
		//System.out.println("Script executed successfully");
		
    }
}
