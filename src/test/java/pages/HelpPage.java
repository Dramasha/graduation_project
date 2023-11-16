package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class HelpPage {
    private final SelenideElement
            menuPopover = $(byText("Еще")),
            questionsOption = $("[data-item-type='/help/what-to-do/']"),
            searchField = $("[data-qa-type='uikit/inputAutocomplete.value.input']"),
            firstSearchTip = $("[data-qa-type='uikit/popoverBlock']").shouldHave(text("Пригласить друга в Тинькофф Инвестиции")),
            title = $("[data-level='1']");

    public HelpPage hoverAndClick() {
        menuPopover.hover();
        questionsOption.click();
        webdriver().shouldHave(url("https://www.tinkoff.ru/help/what-to-do/"));

        return this;
    }

    public HelpPage clickSearchField() {
        searchField.click();

        return this;
    }

    public HelpPage typeRequest(String request) {
        searchField.sendKeys(request);

        return this;
    }

    public HelpPage chooseFirstSearchTip() {
        firstSearchTip.click();

        return this;
    }

    public HelpPage checkTitlePage(String value) {
        title.shouldHave(text(value));

        return this;
    }
}