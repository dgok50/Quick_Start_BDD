package ru.lanit.at.steps.web.pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import ru.lanit.at.steps.web.AbstractWebSteps;
import ru.lanit.at.utils.web.pagecontext.PageManager;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.SelenideElement.*;


public class MosecomMosSteps extends AbstractWebSteps {

    public MosecomMosSteps(PageManager pageManager) {
        super(pageManager);
    }

    @Допустим("на странице присутствует {string}")
    public void наСтраницеПрисутствует(String string) {
        SelenideElement element = pageManager
                .getCurrentPage()
                .getElement(string);
        element.should(exist);
    }

    @Допустим("проверка что опрос на стадии {int}")
    public void опросНаСтадии(int value) {
        SelenideElement element = pageManager
                .getCurrentPage()
                .getElement("строка Стадии Опроса");
        element.shouldHave(exactText("Вопрос " + value + "/5"));
    }

    @Допустим("выбрать пункт опроса {string}")
    public void выбратьПунктОпроса(String value) {
        $(byXpath("//div[contains(text(),'Выберите характер запаха из списка')]/following::input[contains(@value,'"+value+"')]/following-sibling::span")).click();
    }




}