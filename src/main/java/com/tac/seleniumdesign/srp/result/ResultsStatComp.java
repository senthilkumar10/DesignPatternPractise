package com.tac.seleniumdesign.srp.result;

import com.tac.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author senthil
 */
public class ResultsStatComp extends AbstractComponent {

    @FindBy(id="result-stats")
    private WebElement stat;


    public ResultsStatComp(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return wait.until(d-> this.stat.isDisplayed());
    }

    public String getStat(){
        return this.stat.getText();
    }
}
