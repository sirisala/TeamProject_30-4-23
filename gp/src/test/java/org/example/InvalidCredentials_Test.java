package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class InvalidCredentials_Test {
    WebDriver driver;

    @Test(priority =3 )
    public void test() throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        InvalidCredentials i= new InvalidCredentials(driver);
        Profile p= new Profile(driver);
        Products ps = new Products(driver);
        Thread.sleep(1000);
        driver.get("https://www.tcl.com/in/en");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        try{
            p.testProfile();
            i.enterInvalidDetails();
            ps.selectProduct();
        }
        catch (Exception e){
            System.out.println("invalid username and password");
        }

    }
    }

