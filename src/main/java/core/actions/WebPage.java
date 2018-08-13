package core.actions;

import core.webdriver.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPage extends WebDriverFactory {
    private final WebDriver webDriver = super.getWebDriver();
    private WebElement tempElement;

    public WebDriver getWebDriver() { return webDriver; }

    public void clickElementByID(String elementID) {
        tempElement = webDriver.findElement(By.id(elementID));
        tempElement.click();
    }
}
