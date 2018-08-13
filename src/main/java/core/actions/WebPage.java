package core.actions;

import core.webdriver.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPage extends WebDriverFactory {
    private WebDriver webDriver = getWebDriver();
    private WebElement tempElement;

    public WebPage() throws Throwable{}

    public void clickElementByID(String elementID) {
        tempElement = webDriver.findElement(By.id(elementID));
        tempElement.click();
    }
}
