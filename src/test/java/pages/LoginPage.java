package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(linkText = "Sign in")
    private WebElement btn_Login;

    @FindBy (name = "email")
    private WebElement input_Email;

    @FindBy (id = "passwd")
    private WebElement input_Password;

    @FindBy (id = "SubmitLogin")
    private WebElement btn_Submit;

    @FindBy (css = ".info-account")
    private WebElement lbl_AccountInfo;

    public void clickLogin() { btn_Login.click(); }

    public void enterUserNamedAndPassWord() {
        input_Email.sendKeys("blog.cucumber@gmail.com");
        input_Password.sendKeys("Cucumber@blog");
    }

    public void clickSubmit() { btn_Submit.click(); }

    public void verifyInfo() {
        String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String act_message = lbl_AccountInfo.getText().trim();
    }
}
