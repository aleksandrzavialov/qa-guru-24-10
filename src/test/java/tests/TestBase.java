package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import data.Language;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.DriverPage;
import pages.HelpPage;
import pages.MainPage;

public class TestBase {

    protected static MainPage mainPage = new MainPage();
    protected static HelpPage helpPage = new HelpPage();
    protected static DriverPage driverPage = new DriverPage();
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://www.emirates.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 5000;
        Configuration.browser = "chrome";
    }

    @BeforeEach
    void beforeEach() {
        mainPage.openMainPage();
        mainPage.changeLanguage(Language.GB);
    }

    @AfterEach()
    void afterEach() {
        Selenide.closeWebDriver();
    }
}
