package com.ckon.pageObjects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

public class AmazonGiftCardPage extends WebComponent {

    public enum MainPageLocators {
        PRINT_AT_HOME_BUTTON("css=[aria-label='Print at home']");

        private String myLocator;

        MainPageLocators(String locator) { myLocator = locator; }

        public String get() { return myLocator; }

    }

    public void pressPrintAtHomeButton() { controller().press(MainPageLocators.PRINT_AT_HOME_BUTTON.get()); }
}
