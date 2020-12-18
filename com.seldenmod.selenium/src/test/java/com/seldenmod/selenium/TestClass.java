package com.seldenmod.selenium;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import java.net.MalformedURLException;
import java.net.URL;
 
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class TestClass {
 static WebDriver driver;
 static String nodeUrl;
 
 @Test
 public void mailTest() throws MalformedURLException{
     DesiredCapabilities dr=null;
     
     dr=DesiredCapabilities.firefox();
     dr.setBrowserName("firefox");
     dr.setPlatform(Platform.WINDOWS);
  
    
          
     RemoteWebDriver driver=new RemoteWebDriver(new    URL("http://11.11.8.255:39294/wd/hub"), dr);
     driver.navigate().to("http://gmail.com");
   
     driver.close();
  
}
 
 
}