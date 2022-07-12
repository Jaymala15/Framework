package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

    Properties prop;

    public ConfigDataProvider() throws IOException
    {
        File file = new File(".\\Configurations\\config.properties");
        FileInputStream src = new FileInputStream(file);
        prop = new Properties();
        prop.load(src);
    }

    public String getBrowser()
    {
        return prop.getProperty("browser");
    }

    public String getURL()
    {
        return prop.getProperty("URL");
    }
}
