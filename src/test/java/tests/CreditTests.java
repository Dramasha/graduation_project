package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CreditPage;

import static io.qameta.allure.Allure.step;

@Tag("loans")
@Feature("Проверка раздела 'Кредиты и ипотека'")
@Owner("Dramasha")
public class CreditTests extends BaseTest {
    CreditPage creditPage = new CreditPage();

    @Test
    @DisplayName("Проверка заполнения поля 'Цель кредита' при выборе значения из списка")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru/loans")
    void checkCreditGoalOption() {
        step("Открытие страницы раздела 'Кредиты и ипотека'", () ->
                creditPage.openPage());
        step("Клик на поле с выпадающим списком целей кредита", () ->
                creditPage.clickGoalsDropdown());
        step("Выбор значения из списка", () ->
                creditPage.chooseGoalOption(dataTest.goalsInput));
        step("Проверка выбранного значения из списка в поле", () ->
                creditPage.checkChosenOption(dataTest.goalsInput));
    }

    @Test
    @DisplayName("Проверка наличия 3-х шагов по составлению заявки на кредит")
    @Severity(SeverityLevel.CRITICAL)
    @Link(value = "Tinkoff", url = "https://www.tinkoff.ru/loans")
    void checkVisibleSteps() {
        step("Открытие страницы раздела 'Кредиты и ипотека'", () ->
                creditPage.openPage());
        step("Проверка отображения 3-х шагов по составлению заявки на кредит", () ->
                creditPage.checkStepsExist(dataTest.steps));
    }
}