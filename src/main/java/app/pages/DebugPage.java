package app.pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class DebugPage extends BasePage {
    private WebDriver webDriver = super.webDriver;

    public DebugPage() throws Throwable {}

    @FindBy(linkText = "Sign in")
    private WebElement btn_Login;

//    @FindBy (name = "email")
//    private WebElement input_Email;
//
//    @FindBy (id = "passwd")
//    private WebElement input_Password;
//
//    @FindBy (id = "SubmitLogin")
//    private WebElement btn_Submit;
//
//    @FindBy (css = ".info-account")
//    private WebElement lbl_AccountInfo;

    private WebElement btn_Login() {
        return webDriver.findElement(By.linkText("Sign in"));
    }

    private WebElement input_Email() {
        return webDriver.findElement(By.name("email"));
    }

    private WebElement input_Password() {
        return webDriver.findElement(By.id("passwd"));
    }

    private WebElement btn_Submit() {
        return webDriver.findElement(By.id("SubmitLogin"));
    }

    private WebElement lbl_AccountInfo() {
        return webDriver.findElement(By.cssSelector(".info-account"));
    }

    public void navigateToHome() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://automationpractice.com/index.php");
    }

    public void clickLogin() {
//        btn_Login.click();
        btn_Login().click();
    }

    public void enterUserNandAndPassWord() {
        input_Email().sendKeys("blog.cucumber@gmail.com");
        input_Password().sendKeys("Cucumber@blog");
    }

    public void clickSubmit() {
        clickElementByID("SubmitLogin");
//        btn_Submit().click();
    }

    public void verifyInfo() {
        String exp_message = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String act_message = lbl_AccountInfo().getText().trim();
    }
}
