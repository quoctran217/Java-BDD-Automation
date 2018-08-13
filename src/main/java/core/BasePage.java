package core;

import core.actions.WebPage;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebPage {
    private final WebDriver webDriver = super.getWebDriver();

    public WebDriver getWebDriver() { return webDriver; }
}
