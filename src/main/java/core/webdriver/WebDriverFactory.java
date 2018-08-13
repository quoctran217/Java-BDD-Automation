package core.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
    protected static WebDriver webDriver;
    private static String browserName = System.getProperty("browser");//Get browser value from cmd

    public WebDriverFactory() throws Throwable{
        if (this.webDriver == null)
            this.webDriver = setWebDriver();
    }

    public WebDriver getWebDriver() {
        System.out.print("\nCurent webdriver ------->> ");
        System.out.println(this.webDriver);
        return this.webDriver;
    }

    private WebDriver setWebDriver() throws Throwable {
        //Set download directory of webdriver to <drivers>
        WebDriverManager.config().setTargetPath("drivers");

        //Initiate a new webdriver instance base on browserName
        Class<? extends WebDriver> driverClass;
        this.browserName = this.browserName.toLowerCase().trim();
        switch (this.browserName) {
            case "ie":
                driverClass = InternetExplorerDriver.class;
                WebDriverManager.getInstance(driverClass).setup();
                this.webDriver = driverClass.newInstance();
                return this.webDriver;
            default:
                driverClass = ChromeDriver.class;
                WebDriverManager.getInstance(driverClass).setup();
                this.webDriver = driverClass.newInstance();
                return this.webDriver;

        }
    }
}
