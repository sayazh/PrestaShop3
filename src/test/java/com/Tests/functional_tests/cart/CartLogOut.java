package com.Tests.functional_tests.cart;

import com.Pages.HomePage;
import com.Utilities.BrowserUtilities;
import com.Utilities.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartLogOut extends TestBase {
    HomePage homePage = new HomePage();
    @Test
    public void logOutTest(){
        //1.Open browser
        //2. Go to http://automationpractice.com/index.php
        BrowserUtilities.open();

        //3.Login as any valid user
        action.moveToElement(homePage.signInButton).perform();
        homePage.signInButton.click();
        homePage.emailfield.sendKeys("amina@gmail.com");
        homePage.passwdfield.sendKeys("amina2011");
        homePage.submitButton.click();

        //4.Go back to home page
       homePage.logoNameToGoBackHomePage.click();

        //5. Add any product in the home to the cart
       action.moveToElement(homePage.blouseProduct).perform();

        homePage.blouseProduct.click();


        homePage.procceedCkechOut.click();
        //6. Hover over the cart icon
        action.moveToElement(homePage.hoverOverCartIcon).perform();

        //7.Verify that cart contains the product
       Assert.assertTrue(homePage.blouseIntheCart.getText().contains("Blouse"));

       //8.Log out
        action.moveToElement(homePage.logOutButton).perform();
        homePage.logOutButton.click();

        //9. Verify the cart contains the word empty
       Assert.assertTrue(homePage.emptyCart.getText().contains("empty"));

    }
}
