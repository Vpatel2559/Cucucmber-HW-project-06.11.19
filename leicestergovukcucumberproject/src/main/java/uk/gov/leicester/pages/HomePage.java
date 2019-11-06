package uk.gov.leicester.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.gov.leicester.utility.Util;

public class HomePage extends Util {

    @FindBy(xpath = "//a[@class='button']")
    WebElement myaccountLink;

    public void clickOnMyaccountLink(){ clickOnElement(myaccountLink);}


}
