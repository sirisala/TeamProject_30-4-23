package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clear_Test {
    WebDriver driver;
    @Test(priority = 4)
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Clear c= new Clear(driver);
        Profile p = new Profile(driver);
        InvalidCredentials i = new InvalidCredentials(driver);
        driver.get("https://www.tcl.com/in/en");
        driver.manage().window().maximize();
//        Thread.sleep(10000);
       try{
           p.testProfile();
           i.enterInvalidDetails();
           c.clearFields();
       }
       catch (Exception e){
           System.out.println("text field not cleared");
       }
    }
}
