package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Profile_Test {
    WebDriver driver;

    @Test(priority = 1)
    public void test() throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Profile p =new Profile(driver);
        driver.get("https://www.tcl.com/in/en");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        try{
            p.testProfile();
        }
        catch (Exception e){
            System.out.println("Nor able to open the profile");
        }

    }
}
