package org.example;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest  extends BasePage {


        @BeforeMethod
        public static void setBrowser() {
            //Path to open the browser
            System.setProperty("webdriver.chrome.driver", "C:\\SOFT\\Chrome\\chromedriver.exe");
            driver = new ChromeDriver();
            //To maximize the window
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //the path to url
            driver.get("https://demo.nopcommerce.com/");
        }

        @AfterMethod
        public static void closeBrowser() {
            driver.quit();
        }
    }




