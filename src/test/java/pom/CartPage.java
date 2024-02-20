package pom;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    @SuppressWarnings("unused")
    private AndroidDriver driver;

    public CartPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @CacheLookup
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"cart badge\"]")
    private WebElement btn_cart_view;
    public void Appuerbtn_cart_view(){
        btn_cart_view.click();
    }
    @CacheLookup
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Proceed To Checkout\"]")
    private WebElement btn_cart_checkout;
    public void Appuerbtn_cart_checkout(){
        btn_cart_checkout.click();
    }

















}
