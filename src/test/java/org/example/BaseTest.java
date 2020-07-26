package org.example;

import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sun.text.normalizer.Utility;

import java.util.concurrent.TimeUnit;

public class BaseTest  extends Util{


        @BeforeMethod
        public static void setBrowser() {
            //Path to open the browser
            System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDrivers\\chromedriver.exe");
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




