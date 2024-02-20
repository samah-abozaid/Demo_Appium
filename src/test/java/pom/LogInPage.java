package pom;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    @SuppressWarnings("unused")
    private AndroidDriver driver;

    public LogInPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @CacheLookup
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Username input field\"]")
    private WebElement txt_username;

    @CacheLookup
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Password input field\"]")
    private WebElement txt_password;

    @CacheLookup
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Login button\"]")
    private WebElement BTN_Login;

    public void saisiUserName(String userName){
        txt_username.sendKeys("userName");
    }
    public void saisiPassword(String Password){
        txt_username.sendKeys("password");
    }
    public void clickerBTNLogin(){
        BTN_Login.click();
    }

    public void szconnecter(String userName,String  password){
        txt_username.sendKeys("userName");
        txt_password.sendKeys("password");
        BTN_Login.click();
    }









}
