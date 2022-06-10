package com.ckon.pageObjects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

/**
 * Page object model for the Amazon Gift Card Page
 * @author Christos Kontosis
 */
public class AmazonGiftCardPage extends WebComponent {

    public enum MainPageLocators {
        PRINT_AT_HOME_BUTTON("css=[aria-label='Print at home']");

        private String myLocator;

        MainPageLocators(String locator) { myLocator = locator; }

        public String get() { return myLocator; }

    }

    /**
     * Presses Gift Cards on the Navigation Bar that navigates to
     * {@link com.ckon.pageObjects.AmazonPrintAtHomeGiftCardPage}
     */
    public void pressPrintAtHomeButton() { controller().press(MainPageLocators.PRINT_AT_HOME_BUTTON.get()); }
}
