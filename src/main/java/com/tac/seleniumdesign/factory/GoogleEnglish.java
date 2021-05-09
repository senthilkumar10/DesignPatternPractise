package com.tac.seleniumdesign.factory;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author senthil
 */
class GoogleEnglish extends GooglePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @FindBy(name="q")
    private WebElement searchBox;

    @FindBy(name="btnK")
    private WebElement searchBtn;

    @FindBy(css="div.yuRUbf")
    private List<WebElement> results;

    @FindBy(css="div.VDity>button:nth-child(2)")
    private WebElement iAgree;

    public GoogleEnglish(final WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }

    @Override
    public void launchSite() {
        this.driver.get("https://www.google.com");
        this.wait.until(d->this.iAgree.isDisplayed());
        this.iAgree.click();

    }

    @Override
    public void search(String keyword) {
        for(char c: keyword.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(5, TimeUnit.MILLISECONDS);
            searchBox.sendKeys(c + "");
        }

        this.wait.until(d->this.searchBtn.isDisplayed());
        this.searchBtn.click();
    }

    @Override
    public int getResultCount() {
        this.wait.until(d -> this.results.size()>1);
        return results.size();
    }
}
