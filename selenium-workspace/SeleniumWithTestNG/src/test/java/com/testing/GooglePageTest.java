package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GooglePageTest {
  @Test
  public void f() {
	  wd.get("https://www.google.com/");
	  wd.manage().window().maximize();
  }
  WebDriver wd;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\bava\\eclipse_workspace\\selenium\\chromedriver_win32\\chromedriver.exe");
	 wd=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
