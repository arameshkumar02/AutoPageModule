package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {
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

    public static void closeBrowser() {
        driver.quit();
    }
}
