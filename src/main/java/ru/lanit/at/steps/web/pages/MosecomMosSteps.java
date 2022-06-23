package ru.lanit.at.steps.web.pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.Before;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Тогда;
import ru.lanit.at.steps.web.AbstractWebSteps;
import ru.lanit.at.utils.web.pagecontext.PageManager;
import io.qameta.allure.Attachment;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;



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

    @Допустим("опрос на стадии {int}")
    public void опросНаСтадии(int value) {
        SelenideElement element = pageManager
                .getCurrentPage()
                .getElement("строка Стадии Опроса");
        element.shouldHave(exactText("Вопрос " + value + "/5"));
    }

    @Тогда("выбрать пункт {string} опроса на стадии {string}")
    public void выбратьПунктОпроса(String value, String stage) {
        $(byXpath("//div[contains(text(),'"+stage+"')]/following::input[contains(@value,'"+value+"')]/following-sibling::span")).click();
    }

    @Тогда("выбрать временной отрезок {string}")
    public void выбратьВременнойОтрезок(String value) {
        $(byXpath("//div[contains(@placeholder,'Выберите временные отрезки')]/following-sibling::*//span[contains(text(), '"+value+"')]")).click();
    }

    @Attachment(value = "Снимок экрана страницы", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }


}