package uk.gov.leicester;

import cucumber.api.java.Before;
import org.junit.After;
import uk.gov.leicester.basepage.BasePage;
import uk.gov.leicester.browserselector.BrowserSelector;
import uk.gov.leicester.loadproperty.LoadProperty;

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
