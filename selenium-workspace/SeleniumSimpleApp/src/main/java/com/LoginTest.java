package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bava\\eclipse_workspace\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("http://127.0.0.1:5500/login.html");
//		String sourceCurrentPagePath=wd.getCurrentUrl();
//		System.out.println(sourceCurrentPagePath);
//		WebElement emailIdRef=wd.findElement(By.id("n1"));
//		WebElement passwordRef=wd.findElement(By.id("n2"));
//		emailIdRef.sendKeys("raj@gmail.com");
//		passwordRef.sendKeys("123");
//		
//		//submit button
//		WebElement submitButtonRef=wd.findElement(By.id("b1"));
//		submitButtonRef.click();
//		String targetcurrentPagePath=wd.getCurrentUrl();
//		System.out.println(targetcurrentPagePath);
//		WebElement h2TagRef=wd.findElement(By.tagName("h2"));
//		System.out.println(h2TagRef.getText());
//		
		
		//reset button
//		WebElement resetButtonRef=wd.findElement(By.id("b2"));
//		resetButtonRef.click();
		
		//email validation
//		WebElement emailIdRef=wd.findElement(By.id("n1"));
//     	WebElement passwordRef=wd.findElement(By.id("n2"));
//     	WebElement submitButtonRef=wd.findElement(By.id("b1"));
//     	submitButtonRef.click();
//     	
//     	Alert alertRef=wd.switchTo().alert();
//     	System.out.println(alertRef);
//     	alertRef.accept();
		
		//password validation
		WebElement emailIdRef = wd.findElement(By.id("n1"));
		WebElement passwordRef = wd.findElement(By.id("n2"));
		emailIdRef.sendKeys("raj@gmail.com");
		WebElement submitButtonRef = wd.findElement(By.id("b1"));
		submitButtonRef.click();
		Alert alertRef	= wd.switchTo().alert();		// give the alert box reference 
		System.out.println(alertRef.getText());		// alert box content 
		alertRef.accept();							// click ok bututon of alert box 
	
		
		wd.close();
	}

}
