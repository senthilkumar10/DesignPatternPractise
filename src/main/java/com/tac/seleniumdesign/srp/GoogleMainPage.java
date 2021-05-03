package com.tac.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author senthil
 */
public class GoogleMainPage {

    private WebDriver driver;
    private SearchWidgetComp searchWidgetComp;
    private SearchSuggestionComp searchSuggestionComp;

    public GoogleMainPage(final WebDriver driver) {
        this.driver = driver;
        this.searchWidgetComp = PageFactory.initElements(driver,SearchWidgetComp.class);
        this.searchSuggestionComp = PageFactory.initElements(driver,SearchSuggestionComp.class);
    }

    public void goTo(){
        this.driver.get("https://www.google.com");
    }

    public SearchSuggestionComp getSearchSuggestionComp() {
        return searchSuggestionComp;
    }

    public SearchWidgetComp getSearchWidgetComp() {
        return searchWidgetComp;
    }
}
