package com.java.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selenium {
	
	@Test
	void test() {
        // Set the path to ChromeDriver (if it's not in the PATH environment variable)
        System.setProperty("webdriver.chrome.driver", "/Users/vishalgoswami/eclipse/webdriver/chromedriver-mac-arm64/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
       
        WebElement el = driver.findElement(By.xpath("//*[@id=\"openwindow\"]"));
    	System.out.println(driver.getWindowHandle());

        el.click();
       
        
        Set<String> handel = driver.getWindowHandles();
        String mainwindow = driver.getWindowHandle();
        
        for(String s: handel) {
        	
        	System.out.println(driver.getWindowHandle());
        }
        // Close the browser
        
    }
}
