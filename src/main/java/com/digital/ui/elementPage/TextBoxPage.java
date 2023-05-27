package com.digital.ui.elementPage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.digital.ui.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TextBoxPage extends BasePage {

    public SelenideElement fullName = $(By.id("userName"));
    public SelenideElement email = $x("//input[@id='userEmail']");
    public SelenideElement currAdd = $x("//input[@id='currentAddress']");
    public SelenideElement permanAdd = $(By.id("permanentAddress"));
    public SelenideElement submitBtn = $(By.id("submit"));

    public SelenideElement resName = $(By.id("name"));
    public SelenideElement resEmail = $(By.id("email"));
    public SelenideElement resCurrentAdd = $x("//div[@id='output']//p[@id='currentAddress']");
    public SelenideElement resPermanAdd = $x("//div[@id='output']//p[@id='permanentAddress']");


    public TextBoxPage inputField(SelenideElement element,String txt){
        elementActions.inputText(element,txt);
        return this;
    }

    public TextBoxPage pressSubmitBtn(SelenideElement element){
        elementActions.press(element);
        return this;
    }









}
