package com.tac.seleniumdesign.srp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author senthil
 */
public class SearchWidgetComp extends AbstractComponent{

    private WebDriverWait wait;

    @FindBy(name="q")
    private WebElement searchBox;

    public SearchWidgetComp(final WebDriver driver) {
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }

    public void enter(String keyword){
        searchBox.clear();
        searchBox.sendKeys(keyword);
    }

    @Override
    public boolean isDisplayed() {
        this.wait.until(ExpectedConditions.visibilityOf(searchBox));
        return searchBox.isDisplayed();
    }
}
