package com.tac.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * @author senthil
 */
public class SearchSuggestionComp extends AbstractComponent{

    @FindBy(css = "li.sbct")
    private List<WebElement> suggestions;

    public SearchSuggestionComp(final WebDriver driver) {
        super(driver);
    }

    public void clickSuggestionByIndex(int index){
        this.suggestions.get(index-1).click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(d->this.suggestions.size()>5);
    }
}
