package com.ckon.pageObjects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

/**
 * Page object model for the Amazon Main Page
 * @author Christos Kontosis
 */
public class AmazonMainPage extends WebComponent {

    public enum MainPageLocators {
        GIFT_CARD_BUTTON("//div[@id='nav-xshop']/a[contains(text(),'Gift Cards')]"),
        DONT_CHANGE_LOCATION("css=div.glow-toaster-footer input.a-button-input");
        private String myLocator;

        MainPageLocators(String locator) { myLocator = locator; }

        public String get() { return myLocator; }

    }

    /**
     * Presses Gift Cards on the Navigation Bar that navigates to
     * {@link com.ckon.pageObjects.AmazonGiftCardPage}
     */
    public void pressGiftCardButton() { controller().press(MainPageLocators.GIFT_CARD_BUTTON.get()); }

    /**
     * Presses Don't Change button if the pop-up appears
     */
    public void pressDontChangeButton() {
        boolean exists = !controller().isComponentNotPresent(MainPageLocators.DONT_CHANGE_LOCATION.get());
        if (exists) {
            controller().press(MainPageLocators.DONT_CHANGE_LOCATION.get());
        }
    }
}
