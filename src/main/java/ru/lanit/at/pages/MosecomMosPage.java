package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "MosecomMos")
public class MosecomMosPage extends WebPage {

    @Name("Опрос о качестве воздуха")
    private SelenideElement weatherQuizHead =
            $x("//div[not(@style='display: none;')]/div[contains(text(),'Пройти опрос о качестве воздуха в Москве')]");

    @Name("поле адреса")
    private SelenideElement weatherQuizAddress =
            $x("//div[not(@style='display: none;')]/div[contains(text(),'Укажите адрес появления запаха')]/following-sibling::div/input");

    @Name("Кнопка Ответить")
    private SelenideElement weatherQuizAnswerButton =
            $x("//div[not(@style='display: none;')]/div[contains(text(),'Пройти опрос о качестве воздуха в Москве')]/following-sibling::*/button[contains(text(),'Ответить')]");

    @Name("строка Стадии Опроса")
    private SelenideElement weatherQuizStageString =
            $x("//div[not(@style='display: none;')]/div[contains(text(),'Пройти опрос о качестве воздуха в Москве')]/following-sibling::div[contains(text(),'Вопрос')]");

    @Name("первый из списка адресов")
    private SelenideElement weatherQuizAddressFirst =
            $x("//div[contains(text(),'Укажите адрес появления запаха')]/following-sibling::div/div/ul/li[1]");



}
