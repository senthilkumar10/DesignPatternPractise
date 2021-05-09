package com.tac.seleniumdesigntest.factory;

import com.tac.seleniumdesign.factory.GoogleFactory;
import com.tac.seleniumdesign.factory.GooglePage;
import com.tac.seleniumdesigntest.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author senthil
 */
public class GooglePageTest extends BaseTest {

    private GooglePage googlePage;

    @Test(dataProvider = "getData")
    public void searchTest(String language,String keyword){
        this.googlePage = GoogleFactory.get(language,this.driver);
        this.googlePage.launchSite();
        this.googlePage.search(keyword);
        int resultCount = this.googlePage.getResultCount();

        System.out.println(resultCount);
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"ENG","Selenium"},
                {"FR","Selenium"},
                {"ARABIC","Selenium"},
                {"SPANISH","Selenium"},
        };
    }

}
