package pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class productPage {
    @SuppressWarnings("unused")
    private AndroidDriver driver;
    public productPage() {
    }
    public productPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @CacheLookup
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"store item text\" and @text=\"Sauce Labs Backpack\"]")
    private WebElement productItem;
    public void selectionner_article(){
        productItem.click();
    }

    @CacheLookup
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"red circle\\\"]/android.view.ViewGroup\"")
    private WebElement product_color;

    public void selectionner_color(){
        product_color.click();
    }
    @CacheLookup
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"counter plus button\"]/android.widget.ImageView")
    private WebElement plusButon;

    public void pusButon(){
        product_color.click();
    }

    @CacheLookup
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]")
    private WebElement addToCart;

    public void addToCart(){
        product_color.click();
    }


    // public void typePassword(String password) {
    //     passwordElement.sendKeys(password);
    // }


}
