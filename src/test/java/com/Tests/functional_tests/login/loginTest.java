package com.Tests.functional_tests.login;

import com.Pages.HomePage;
import com.Utilities.BrowserUtilities;
import com.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends TestBase {
    HomePage homePage = new HomePage();
    @Test
    public void loginTest() {


        //1. Open browser
        //2. Go to
        BrowserUtilities.open();

        //3.Add any product in the homepage to the cart
        action.moveToElement(homePage.blouseProduct).perform();
        homePage.blouseProduct.click();

        homePage.procceedCkechOut.click();
        //4.Hover over the cart icon
        action.moveToElement(homePage.hoverOverCartIcon).perform();

        //5.Verify that cart contains the product
       Assert.assertTrue(homePage.blouseIntheCart.getText().contains("Blouse"));

       //6. Login as any valid user
        homePage.signInButton.click();
        homePage.emailfield.sendKeys("amina@gmail.com");
        homePage.passwdfield.sendKeys("amina2011");
        homePage.submitButton.click();

        //7.Hover over the cart icon
        action.moveToElement(homePage.hoverOverCartIcon).perform();
        Assert.assertTrue(homePage.productNameIntheCart.getText().contains("Blouse"));
    }
}
