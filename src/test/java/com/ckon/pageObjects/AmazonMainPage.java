package com.ckon.pageObjects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

public class AmazonMainPage extends WebComponent {

    public enum MainPageLocators {
        GIFT_CARD_BUTTON("//div[@id='nav-xshop']/a[contains(text(),'Gift Cards')]"),
        DONT_CHANGE_LOCATION("css=div.glow-toaster-footer input.a-button-input");
        private String myLocator;

        MainPageLocators(String locator) { myLocator = locator; }

        public String get() { return myLocator; }

    }

    public void pressGiftCardButton() { controller().press(MainPageLocators.GIFT_CARD_BUTTON.get()); }

    public void pressDontChangeButton() {
        boolean exists = !controller().isComponentNotPresent(MainPageLocators.DONT_CHANGE_LOCATION.get());
        if (exists) {
            controller().press(MainPageLocators.DONT_CHANGE_LOCATION.get());
        }
    }
}
