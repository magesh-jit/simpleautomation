package com.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.example.utils.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddSegment {
      @Test
	public void addSegment() throws InterruptedException {
		 WebDriver driver;
		    ConfigReader config;
		
		  config = new ConfigReader();
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
		
		// Read values from config.properties
      String appUrl = config.getProperty("app.url");
      String username = config.getProperty("app.username"); // Correct key
      String password = config.getProperty("app.password"); // Correct key

      // Open application
      driver.get(appUrl);

      
      // **Login Steps**
      driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);  // Update if needed
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);  // Update if needed
      driver.findElement(By.xpath("//button[@type='submit']")).click();  // Update if needed

      // **Navigate to Users Page**
      
 
      
      driver.findElement(By.xpath("//a[@href='https://blitz.innoblitz.in/fireblitz/public/segments']")).click();
      driver.findElement(By.xpath("//button[@class='btn btn-primary float-right mb-4']")).click();
     
     
      
      // **Fill User Details**
      
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("//input[@id='segment']")).sendKeys("Chemicals");

      // **Click Submit Button**
      driver.findElement(By.xpath("//button[@id='addButton']")).click();

      System.out.println("Segment added successfully!");
      
      driver.quit();
      
	
}

}
