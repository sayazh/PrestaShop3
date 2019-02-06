package com.Tests.functional_tests.cart;

import com.Pages.HomePage;
import com.Utilities.BrowserUtilities;
import com.Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartCheckOutDelete extends TestBase {

    HomePage homePage = new HomePage();
    @Test
    public void cartCheckOutDeleteTest() throws InterruptedException {

        //1. Open browser
        //2. Go to http://automationpractice.com/index.php
        BrowserUtilities.open();

        //3. Add any product in the homepage to the cart
        action.moveToElement(homePage.blouseProduct).perform();
        homePage.blouseProduct.click();

        //4. Click on Continue shopping
        homePage.continueShopping.click();

        //5.Add another product in the homepage to the cart
        action.moveToElement(homePage.printedSummerDressAddButton).perform();
        homePage.printedSummerDressAddButton.click();

        //6. Click on Proceed to checkout
        homePage.procceedCkechOut.click();

        //7. Verify message Your shopping cart contains: 2 Products
        Assert.assertTrue(homePage.shoppingCartSummaryMsg.getText().contains("Your shopping cart contains: 2 Products"));

        //8. Click the delete icon to delete one of the products
        homePage.deleteIconOfTheSummerDress.click();
        Thread.sleep(5000);

        //9. Verify message Your shopping cart contains: 1 Product
        Assert.assertTrue(homePage.shoppingCartSummaryMsg.getText().contains("Your shopping cart contains: 1 Product"));

        //10. Click the delete icon og the second product
        homePage.deleteIconOfBlouse.click();
        Thread.sleep(5000);

        //11.Verify message Your shopping cart is empty
        Assert.assertTrue(homePage.warningMsg.getText().contains("Your shopping cart is empty"));

    }
}
