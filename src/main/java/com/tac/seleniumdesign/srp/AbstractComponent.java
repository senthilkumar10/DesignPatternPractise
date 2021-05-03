package com.tac.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author senthil
 */
public abstract class AbstractComponent {

    protected WebDriverWait wait;
    public abstract boolean isDisplayed();

    public AbstractComponent(final WebDriver driver) {
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }
}
