package com.udemy.pages;

import com.udemy.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

    @FindBy(xpath = "//button[@class='btn btn-quaternary']")
    WebElement loginLink;

    public void clickOnLoginLink(){ clickOnElement(loginLink);}
}
