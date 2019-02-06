package com.Tests.functional_tests.cart;

import com.Pages.HomePage;
import com.Utilities.BrowserUtilities;
import com.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartIconDeleteTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void cartIconDeleteTest() throws InterruptedException {
        //1. Open browser
        //2. Go to http://automationpractice.com/index.php
        BrowserUtilities.open();

        //3. Add any product in the homepage to the cart
        action.moveToElement(homePage.blouseProduct).perform();
        homePage.blouseProduct.click();

        //4. Click on Continue shopping
        homePage.continueShopping.click();

        //5. Hover over the cart icon
        action.moveToElement(homePage.hoverOverCartIcon).perform();

        //6.Click the x to delete the product
        homePage.deleteXIcon.click();

        Thread.sleep(6000);

        //7. Verify word empty is displayed in the Cart icon
       Assert.assertTrue(homePage.emptyCart.getText().contains("empty"));

    }
}
