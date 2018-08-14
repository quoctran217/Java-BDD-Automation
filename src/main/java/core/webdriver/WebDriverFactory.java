package core.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
    private static WebDriver webDriver;
//    private static String browserName = System.getProperty("browser");//Get browser value from cmd
    private static String browserName = "chrome";

    public WebDriverFactory() {
        if (webDriver == null)
            setWebDriver();
    }

    public WebDriver getWebDriver() {
        System.out.print("\n*********** Current webdriver ------->> ");
        System.out.println(webDriver);
        return webDriver;
    }

    private void setWebDriver() {
        //Set download directory of webdriver to <drivers>
        WebDriverManager.config().setTargetPath("drivers");

        //Initiate a new webdriver instance base on browserName
        Class<? extends WebDriver> driverClass;
        browserName = browserName.toLowerCase().trim();
        try {
            switch (browserName) {
                case "ie":
                    driverClass = InternetExplorerDriver.class;
                    WebDriverManager.getInstance(driverClass).setup();
                    break;
                default:
                    driverClass = ChromeDriver.class;
                    WebDriverManager.getInstance(driverClass).setup();
                    break;
            }
            webDriver = driverClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
