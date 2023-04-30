package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class AddToCart_Test {
    WebDriver driver;

    @Test(priority = 9)
    public void test() throws InterruptedException {



            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            AddToCart a = new AddToCart(driver);
            GoToShop g = new GoToShop(driver);
            ProductIteams pi = new ProductIteams(driver);
            Profile p = new Profile(driver);
            ValidCredentails v = new ValidCredentails(driver);
            Products ps = new Products(driver);
            driver.get("https://www.tcl.com/in/en");
            driver.manage().window().maximize();
            Thread.sleep(4000);

            try {
                p.testProfile();
                v.enterValidCredential();
                ps.selectProduct();

                pi.selectItem();
                g.btnGoToShop();
                a.btncart();

            }
            catch (Exception e){
                System.out.println("Not able to add the item in to the cart");
            }
        }
    }

