package com.example.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;

import com.example.utils.ConfigReader;




public class LaunchBrowser {

	    @Test
	    public void launchBrowser() {
	    	
	    	
	    	
	    	
	    	WebDriver driver;
	        // Setup ChromeDriver using WebDriverManager
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        
	        // Maximize window
	        driver.manage().window().maximize();
	        // Open Application
	        driver.get("https://blitz.innoblitz.in/fireblitz/public/");
	        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@gmail.com");
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        
	        System.out.println("Open broswer successfully");
	        driver.quit();
	    
	    }

	   
	    
	}


