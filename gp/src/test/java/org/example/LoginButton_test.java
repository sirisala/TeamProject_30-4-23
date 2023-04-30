package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginButton_test {
    WebDriver driver;

    @Test(priority =2 )
    public void test() throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LoginButton l = new LoginButton(driver);
        Profile p =new Profile(driver);
        Products ps = new Products(driver);
        driver.get("https://www.tcl.com/in/en");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        try{
            p.testProfile();
            l.pressloginbtn();
            ps.selectProduct();
        }
        catch (Exception e){
            System.out.println("Can not login with out credentails");
        }
    }
    }
