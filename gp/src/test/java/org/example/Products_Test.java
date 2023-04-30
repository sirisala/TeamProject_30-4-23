package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Products_Test {
    WebDriver driver;

    @Test(priority =6 )
    public void test() throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


       Profile p = new Profile(driver);
       ValidCredentails v = new ValidCredentails(driver);
        Products ps=  new Products(driver);


        driver.get("https://www.tcl.com/in/en");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        try{
            p.testProfile();
            v.enterValidCredential();
            ps.selectProduct();
        }catch (Exception e){
            System.out.println("product is not able to select");
        }

    }

}
