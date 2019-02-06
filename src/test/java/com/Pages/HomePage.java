package com.Pages;

import com.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //CART LOGIN TEST
    @FindBy(xpath = "//*[@id='homefeatured']/li[2]/div/div[2]/div[2]/a[1]/span")
    public WebElement blouseProduct;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    public WebElement procceedCkechOut;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public WebElement hoverOverCartIcon;

    @FindBy(xpath = "//a[@class='cart_block_product_name']")
    public WebElement blouseIntheCart;

    @FindBy(className = "login")
    public WebElement signInButton;

    @FindBy(id = "email")
    public WebElement emailfield;

    @FindBy(id = "passwd")
    public WebElement passwdfield;

    @FindBy(id = "SubmitLogin")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@class='cart_block_product_name']")
    public WebElement productNameIntheCart;

    //CART LOGOUT TEST
    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    public WebElement logoNameToGoBackHomePage;

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement logOutButton;

    @FindBy(xpath ="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public WebElement emptyCart;

    //CART ICON DELETE TEST
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    public WebElement continueShopping;

    @FindBy(xpath = "//span[@class='remove_link']//a")
    public WebElement deleteXIcon;

    //CART CHECKOUT DELETE TEST
    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[6]/div/div[2]/div[2]/a[1]/span")
    public WebElement printedSummerDressAddButton;


    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement shoppingCartSummaryMsg;

    @FindBy(xpath = "(//i[@class='icon-trash'])[2]")
    public WebElement deleteIconOfTheSummerDress;

    @FindBy(xpath = "(//i[@class='icon-trash'])[1]")
    public WebElement deleteIconOfBlouse;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    public WebElement warningMsg;


}
