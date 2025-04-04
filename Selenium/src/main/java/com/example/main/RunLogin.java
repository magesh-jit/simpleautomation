package com.example.main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.utils.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;



public class RunLogin {

		    public static void main(String[]args) {
		    	
		    	ConfigReader config;
		    	config = new ConfigReader();
		    	
		    	
		    	String url = config.getProperty("app.url");
		        String username = config.getProperty("app.username");
		        String password = config.getProperty("app.password");
		        
		        
		        System.out.println("URL: " + url);
		        System.out.println("Username: " + username);
		        System.out.println("Password: " + password);
		    	
		    	System.out.println("Fireblitz Application");
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
		        
		        

		    }

		   
		    
		}

