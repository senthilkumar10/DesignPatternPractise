package com.tac.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @author senthil
 */
class GoogleFrench extends GoogleEnglish {

    @FindBy(css="div#SIvCob>a")
    private WebElement lauguageLink;

    @FindBy(css="div.VDity>button:nth-child(2)")
    private WebElement iAgree;


    public GoogleFrench(final WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchSite() {
        this.driver.get("https://www.google.fr");
        this.wait.until(d->this.iAgree.isDisplayed());
        this.iAgree.click();
        this.lauguageLink.click();
    }


}
