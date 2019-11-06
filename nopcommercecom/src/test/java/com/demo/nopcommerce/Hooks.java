package com.demo.nopcommerce;

import com.nocommerce.demo.basepage.BasePage;
import com.nocommerce.demo.browserselector.BrowserSelector;
import com.nocommerce.demo.loadproperty.LoadProperty;
import cucumber.api.java.Before;
import org.junit.After;

public class Hooks extends BasePage {
    String browser = new LoadProperty().getProperty("browser");


    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void setUp(){
        System.out.println("driver = " +driver);
        browserSelector.selectBrowser(browser);

    }

    @After
    public void tearDown(){
        driver.quit();;
    }

}
