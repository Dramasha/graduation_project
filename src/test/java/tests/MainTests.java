package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tag("main")
@Feature("Проверка главной страницы")
@Owner("Dramasha")
public class MainTests extends BaseTest {
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка появления списка подсказок в поисковой строке по сгенерированному значению")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru")
    void checkSearchTips() {
        step("Открытие главной страницы сайта", () ->
                mainPage.openPage());
        step("Заполнение поисковой строки сгенерированным значением", () ->
                mainPage.typeText(dataTest.searchInput));
        step("Проверка появившегося списка подсказок по запросу", () ->
                mainPage.checkTipsExist());
    }

    @Test
    @DisplayName("Проверка элементов списка из меню на главной странице")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru")
    void checkEmptyField() {
        step("Открытие главной страницы сайта", () ->
                mainPage.openPage());
        step("Проверка существования элементов из списка", () ->
                mainPage.checkMenuPanelExist(dataTest.menuPanel));
    }
}