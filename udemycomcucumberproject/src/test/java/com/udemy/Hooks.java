package com.udemy;

import com.udemy.basepage.BasePage;
import com.udemy.browserselector.BrowserSelector;
import com.udemy.loadproperty.LoadProperty;
import cucumber.api.java.Before;
import org.junit.After;

public class Hooks extends BasePage {
    String browser = new LoadProperty().getProperty("browser");


    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void setUp(){
        browserSelector.selectBrowser(browser);

    }

    @After
    public void tearDown(){
        driver.quit();;
    }
}
