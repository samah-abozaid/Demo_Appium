package pom;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

    @SuppressWarnings("unused")
    private AndroidDriver driver;

    public FormPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @CacheLookup
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Full Name* input field\"]")
    private WebElement txt_fullname;

    @CacheLookup
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Address Line 1* input field\"]")
    private WebElement txt_adress ;

    @CacheLookup
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Address Line 1* input field\"]")
    private WebElement txt_cite ;

    @CacheLookup
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Zip Code* input field\"]")
    private WebElement txt_zipcode ;

    @CacheLookup
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\\\"Country* input field\\\"]")
    private WebElement txt_country ;

    @CacheLookup
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"To Payment button\"]")
    private WebElement btn_payment ;

    public void saisifullname(String fullName){
        txt_fullname.sendKeys("fullName");
    }
    public void saisitxt_adresse(String fullName){
        txt_adress.sendKeys("adress");
    }




















}
