package uk.co.amazon.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    public WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
