package com.pages;

import com.relevantcodes.extentreports.ExtentReports;
import com.utility.BrowserFactory;
import com.utility.ConfigDataProvider;
import com.utility.ExcelDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseClass {

    public WebDriver driver;
    public ConfigDataProvider config;
    public ExcelDataProvider excel;

    public ExtentReports extentReports;

    @BeforeSuite
    public void setSuite() throws IOException
    {
        excel = new ExcelDataProvider(".\\src\\test\\java\\com\\utility\\ExcelDataProvider.java");
        config = new ConfigDataProvider();
    }

    @BeforeClass
    public void setUp()
    {
        driver = BrowserFactory.setUpBrowser(driver, config.getBrowser(), config.getURL());
    }

    @AfterClass
    public void tearDown()
    {
        BrowserFactory.quitBrowser(driver);
    }
}
