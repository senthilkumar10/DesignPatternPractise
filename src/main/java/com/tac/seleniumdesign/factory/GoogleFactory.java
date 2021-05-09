package com.tac.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author senthil
 */
public class GoogleFactory {

    private static final Function<WebDriver,GooglePage> ENG = d-> new GoogleEnglish(d);
    private static final Function<WebDriver,GooglePage> FR = d-> new GoogleFrench(d);
    private static final Function<WebDriver,GooglePage> ARABIC = d-> new GoogleArabic(d);
    private static final Function<WebDriver,GooglePage> SPANISH = d-> new GoogleSpanish(d);

    private static final Map<String,Function<WebDriver,GooglePage>> MAP = new HashMap<>();

    static {
        MAP.put("ENG",ENG);
        MAP.put("FR",FR);
        MAP.put("ARABIC",ARABIC);
        MAP.put("SPANISH",SPANISH);
    }

    public static GooglePage get(String lanugage, WebDriver driver){
        return MAP.get(lanugage).apply(driver);
    }
}
