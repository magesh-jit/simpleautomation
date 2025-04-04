package com.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.example.utils.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserAdd {

	@Test
    public void userAdd() throws InterruptedException {
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
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@href='https://blitz.innoblitz.in/fireblitz/public/users'])[2]")).click();
        driver.findElement(By.xpath("//a[@href='https://blitz.innoblitz.in/fireblitz/public/users/create']")).click();

        // **Fill User Details**
        driver.findElement(By.xpath("//input[@placeholder='Enter name']")).sendKeys("sharthi");
        driver.findElement(By.xpath("//input[@placeholder='Enter mobile']")).sendKeys("7744558894");
        driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("sharathi2@gmail.com");
        
        
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='purpose-select']"));
        Select select= new Select(dropdown);
        select.selectByValue("2");
        
        // **Click Submit Button**
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        System.out.println("User added successfully!");
        
        driver.quit();
        
	
}
}
