package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.util.Strings;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver setUpBrowser(WebDriver driver, String browser, String URL)
    {
        if (browser.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.firefox.driver", ".\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("IE"))
        {
            System.setProperty("webdriver.IE.driver",".\\Drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else
        {
            System.out.println("Invalid browser name");
        }
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);

        return driver;
    }

    public static void quitBrowser(WebDriver driver)
    {
        driver.close();
        driver.quit();
    }
}
