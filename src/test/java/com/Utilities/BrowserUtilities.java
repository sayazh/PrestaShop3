package com.Utilities;

public class BrowserUtilities {
    public static void open(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}

