package pages;

import core.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected static WebDriver webDriver = new WebDriverFactory().getWebDriver();

    protected static LoginPage loginPage = new LoginPage(webDriver);
}
