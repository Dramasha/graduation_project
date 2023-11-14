package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.DataTest;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    DataTest dataTest = new DataTest();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.tinkoff.ru";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserSize = System.getProperty("browserSize", "2560x1440");
        Configuration.browserVersion = System.getProperty("browserVersion");

        String selenoidUrl = System.getProperty("selenoidUrl", "selenoid.autotests.cloud");
        Configuration.remote = "https://user1:1234@" + selenoidUrl + "/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        Map<String, Object> value = new HashMap<>();
        value.put("enableVNC", true);
        value.put("enableVideo", true);
        capabilities.setCapability("selenoid:options", value);

        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void afterEach() {
        Attach.screenShotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLog();
        Attach.addVideo();

        Selenide.closeWebDriver();
    }
}