package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.annotations.BeforeMethod;

public class Hooks extends Util {
    BrowserManager browserManager = new BrowserManager();
    @Before
    public void openBrowser(){

    }


    @After
    public void closingBrowwser(){
        browserManager.
    }
}
