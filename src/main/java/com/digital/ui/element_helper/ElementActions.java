package com.digital.ui.element_helper;


import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ElementActions {

    private static Logger logger = LogManager.getLogger(ElementActions.class);

    public ElementActions press(SelenideElement element) {
        logger.warn("I'm trying to click " + " " + element);
        element.click();
        logger.info("Succesfully clicked");
        return this;
    }

    public ElementActions inputText(SelenideElement element,String txt) {
        logger.warn("I'm trying to write" + " " + txt);
        element.setValue(txt);
        logger.info("Succesfully written");
        return this;
    }

    public ElementActions openUrl(String url){
        logger.warn("I'm trying to open previous url ");
        WebDriverRunner.getWebDriver().navigate().to(url);
        logger.info("Succesfully url opened");
    }





}
