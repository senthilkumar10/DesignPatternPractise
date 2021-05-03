package com.tac.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author senthil
 */
public class ResultsStackComp extends AbstractComponent{

    @FindBy(id="resultStats")
    private WebElement stack;


    public ResultsStackComp(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return wait.until(d-> this.stack.isDisplayed());
    }
}
