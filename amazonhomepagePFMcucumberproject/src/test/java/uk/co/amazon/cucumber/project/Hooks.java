package uk.co.amazon.cucumber.project;

import cucumber.api.java.Before;
import org.junit.After;
import uk.co.amazon.basepage.BasePage;
import uk.co.amazon.browserselector.BrowserSelector;
import uk.co.amazon.loadproperty.LoadProperty;

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
