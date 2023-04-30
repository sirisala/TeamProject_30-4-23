package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"html-body\"]/div[2]/div[3]/div[1]/div/div[2]/button")
    WebElement cartBtn;

    public AddToCart(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    public void btncart(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        cartBtn.click();
    }

}
