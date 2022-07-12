package com.testcases;

import com.pages.BaseClass;
import com.pages.LoginLocators;
import com.utility.BrowserFactory;
import com.utility.ExcelDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseClass {

    @Test(dataProvider = "LoginData")
    public void login(String username, String password)
    {
        LoginLocators ll = PageFactory.initElements(driver,LoginLocators.class);
        ll.LoginToApplication(username,password);
    }

    @DataProvider(name = "LoginData")
    public String[][] getLoginData() throws IOException {
        /*
        String loginData[][]={
                                {"Tom","Hanks","Tom.Hanks@gmail.com","test@123","15","Jan","1998"},
                                {"Maria","Jones","Maria.Jones@gmail.com","test@124","16","Feb","1999"},
                                {"Nick","Paterson","Nick.Paterson@gmail.com","test@125","17","Mar","2000"}
                             };
        return loginData;*/
        String path = ".\\TestData\\LoginData.xlsx";

        ExcelDataProvider excelUtility = new ExcelDataProvider(path);
        int rowCount = excelUtility.getRowCount("Sheet1");
        int columnCount = excelUtility.getCellCount("Sheet1",1);

        String loginData[][] = new String[rowCount][columnCount];

        for(int i = 1 ; i <= rowCount; i++)
        {
            for(int j = 0; j < columnCount; j++)
            {
                loginData[i-1][j] = excelUtility.getCellData("Sheet1",i,j);
            }
        }

        return loginData;
    }
}
