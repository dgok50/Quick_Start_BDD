package ru.lanit.at.steps.web.pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import ru.lanit.at.steps.web.AbstractWebSteps;
import ru.lanit.at.utils.web.pagecontext.PageManager;


public class MosecomMosSteps extends AbstractWebSteps {

    public MosecomMosSteps(PageManager pageManager) {
        super(pageManager);
    }

    @Допустим("на странице присутствует {string}")
    public void наСтраницеПрисутствует(String string) {
        SelenideElement element = pageManager
            .getCurrentPage()
            .getElement(string);
        element.exists();
    }
    /// реализация шагов специфичных для страницы GooglePage


}