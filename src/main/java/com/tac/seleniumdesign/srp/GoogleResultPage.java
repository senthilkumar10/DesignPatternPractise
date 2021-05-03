package com.tac.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author senthil
 */
public class GoogleResultPage {
    private WebDriver driver;
    private SearchWidgetComp searchWidgetComp;
    private SearchSuggestionComp searchSuggestionComp;
    private ResultsStackComp resultsStackComp;
    private NavigationBarComp navigationBarComp;

    public GoogleResultPage(final WebDriver driver) {
        this.driver = driver;
        this.searchWidgetComp = PageFactory.initElements(driver,SearchWidgetComp.class);
        this.searchSuggestionComp = PageFactory.initElements(driver,SearchSuggestionComp.class);
        this.resultsStackComp = PageFactory.initElements(driver,ResultsStackComp.class);
        this.navigationBarComp = PageFactory.initElements(driver,NavigationBarComp.class);
    }

    public SearchWidgetComp getSearchWidgetComp() {
        return searchWidgetComp;
    }

    public SearchSuggestionComp getSearchSuggestionComp() {
        return searchSuggestionComp;
    }

    public NavigationBarComp getNavigationBarComp() {
        return navigationBarComp;
    }

    public ResultsStackComp getResultsStackComp() {
        return resultsStackComp;
    }
}
