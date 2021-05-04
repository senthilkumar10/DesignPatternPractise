package com.tac.seleniumdesign.srp.common;

import com.google.common.util.concurrent.Uninterruptibles;
import com.tac.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author senthil
 */
public class SearchWidgetComp extends AbstractComponent {

    @FindBy(xpath = "//div[@class='jyfHyd']")
    private List<WebElement> iAgreeButton;

    @FindBy(name="q")
    private WebElement searchBox;

    public SearchWidgetComp(final WebDriver driver) {
        super(driver);
    }

    public void enter(String keyword){
        searchBox.clear();
        for(char c: keyword.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(20, TimeUnit.MILLISECONDS);
            searchBox.sendKeys(c + "");
        }

    }

    public void clickIAgreebtn(){
        if(iAgreeButton.size()>0){
            iAgreeButton.get(1).click();
        }
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(d-> this.searchBox.isDisplayed());
    }
}
