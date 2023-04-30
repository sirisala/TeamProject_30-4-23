package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginButton {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"t-container\"]/div/div/div[1]/div[1]/button/div")
    WebElement loginbtn;

    public LoginButton(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void pressloginbtn(){
        loginbtn.click();
    }
}
