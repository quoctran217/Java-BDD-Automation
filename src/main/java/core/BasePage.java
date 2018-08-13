package core;

import core.actions.WebPage;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebPage {
    public WebDriver webDriver = getWebDriver();

    public BasePage() throws  Throwable{}

}
