package com.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestBase {

        protected WebDriver driver;
        protected Actions action;
        protected SoftAssert softAssert;


        @BeforeClass
        public void setUpClass(){

            WebDriverManager.chromedriver().setup();
        }

        @BeforeMethod
        public void setUpMethod(){

            driver= Driver.getDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            action=new Actions(driver);
            softAssert= new SoftAssert();


        }

        @AfterMethod
        public void tearDownMethod(){

            //Driver.closeDriver();

            softAssert.assertAll();

        }
    }

