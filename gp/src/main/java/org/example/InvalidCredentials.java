package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ResourceBundle;

public class InvalidCredentials {

   public WebDriver driver;
    @FindBy(xpath ="//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/input")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"t-container\"]/div/div/div[1]/div[1]/div[3]/div[1]/div[1]/input")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"t-container\"]/div/div/div[1]/div[1]/button/div")
    WebElement button;

    public InvalidCredentials(WebDriver driver){

            this.driver=driver;
        PageFactory.initElements(driver, this);

        }

        public void enterInvalidDetails() throws InterruptedException {

            ResourceBundle r1 = ResourceBundle.getBundle("config");
             String user= r1.getString("username1");
             String pass = r1.getString("password1");

            username.sendKeys(user);
            password.sendKeys(pass);

            button.click();
            Thread.sleep(5000);








            }
        }



