package com.tac.seleniumdesign.srp.result;

import com.tac.seleniumdesign.srp.common.SearchSuggestionComp;
import com.tac.seleniumdesign.srp.common.SearchWidgetComp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author senthil
 */
public class GoogleResultPage {
    private WebDriver driver;
    private SearchWidgetComp searchWidgetComp;
    private SearchSuggestionComp searchSuggestionComp;
    private ResultsStatComp resultsStatComp;
    private NavigationBarComp navigationBarComp;

    public GoogleResultPage(final WebDriver driver) {
        this.driver = driver;
        this.searchWidgetComp = PageFactory.initElements(driver,SearchWidgetComp.class);
        this.searchSuggestionComp = PageFactory.initElements(driver,SearchSuggestionComp.class);
        this.resultsStatComp = PageFactory.initElements(driver, ResultsStatComp.class);
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

    public ResultsStatComp getResultsStackComp() {
        return resultsStatComp;
    }
}
