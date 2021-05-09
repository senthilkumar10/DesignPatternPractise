package com.tac.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author senthil
 */
class GoogleArabic extends GoogleEnglish{

    @FindBy(css="div#SIvCob>a")
    private WebElement lauguageLink;

    @FindBy(css="div.VDity>button:nth-child(2)")
    private WebElement iAgree;

    @FindBy(css="span.hOoLGe")
    private WebElement keyboardBtn;

    @FindBy(id="kbd")
    private WebElement keyboard;

    public GoogleArabic(WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchSite() {
        this.driver.get("https://www.google.com.sa");
        this.wait.until(d->this.iAgree.isDisplayed());
        this.iAgree.click();
        this.lauguageLink.click();
    }

    @Override
    public void search(String keyword) {
        this.wait.until(d->this.keyboardBtn.isDisplayed());
        this.keyboardBtn.click();
        this.wait.until(d->this.keyboard.isDisplayed());
        super.search(keyword);
    }

}
