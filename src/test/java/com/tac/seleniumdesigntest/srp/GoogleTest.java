package com.tac.seleniumdesigntest.srp;

import com.tac.seleniumdesign.srp.main.GoogleMainPage;
import com.tac.seleniumdesign.srp.result.GoogleResultPage;
import com.tac.seleniumdesigntest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author senthil
 */
public class GoogleTest extends BaseTest {


    private GoogleMainPage googleMainPage;
    private GoogleResultPage googleResultPage;

    @BeforeTest
    public void setupPages(){
        this.googleMainPage = new GoogleMainPage(driver);
        this.googleResultPage = new GoogleResultPage(driver);
    }

    @Test(dataProvider = "getData")
    public void googleWorkFlow(String keyword,int index){

        googleMainPage.goTo();
        Assert.assertTrue(googleMainPage.getSearchWidgetComp().isDisplayed());

        googleMainPage.getSearchWidgetComp().clickIAgreebtn();
        googleMainPage.getSearchWidgetComp().enter(keyword);
        Assert.assertTrue(googleMainPage.getSearchSuggestionComp().isDisplayed());

        googleMainPage.getSearchSuggestionComp().clickSuggestionByIndex(index);
        Assert.assertTrue(googleResultPage.getNavigationBarComp().isDisplayed());

        googleResultPage.getSearchWidgetComp().enter(keyword);
        Assert.assertTrue(googleResultPage.getSearchSuggestionComp().isDisplayed());

        googleResultPage.getSearchSuggestionComp().clickSuggestionByIndex(index);

        googleResultPage.getNavigationBarComp().gotoNews();

        System.out.println(
                googleResultPage.getResultsStackComp().getStat()
        );

    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"Selenium",3},
                {"Docker",2}

        };
    }


}
