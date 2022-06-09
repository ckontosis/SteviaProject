package com.ckon.pageObjects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

public class AmazonMainPage extends WebComponent {

    public enum MainPageLocators {
        GIFT_CARD_BUTTON("//div[@id='nav-xshop']/a[contains(text(),'Gift Cards')]"),
        DONT_CHANGE_LOCATION("//header/div[@id='navbar']/div[@id='nav-main']/div[1]/div[1]/div[1]/div[3]/span[1]/span[1]/input[1]");

        private String myLocator;

        MainPageLocators(String locator) { myLocator = locator; }

        public String get() { return myLocator; }

    }

    public void pressGiftCardButton() { controller().press(MainPageLocators.GIFT_CARD_BUTTON.get()); }
    public void pressDontChangeButton() { controller().press(MainPageLocators.DONT_CHANGE_LOCATION.get()); }
}
