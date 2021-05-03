package com.tac.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author senthil
 */
public class SearchWidgetComp extends AbstractComponent{

    @FindBy(name="q")
    private WebElement searchBox;

    public SearchWidgetComp(final WebDriver driver) {
        super(driver);
    }

    public void enter(String keyword){
        searchBox.clear();
        searchBox.sendKeys(keyword);
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(d-> this.searchBox.isDisplayed());
    }
}
