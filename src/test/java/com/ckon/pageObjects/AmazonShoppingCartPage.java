package com.ckon.pageObjects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

public class AmazonShoppingCartPage extends WebComponent {

    public enum AmazonShoppingCartPageLocators {
        CART_SUBTOTAL("//div[@id='sw-subtotal']/span[2]/span[1]/span[1]");

        private String myLocator;

        AmazonShoppingCartPageLocators(String locator) { myLocator = locator; }

        public String get() { return myLocator; }

    }

    public String getCartSubtotal() {
        return controller().getText(AmazonShoppingCartPageLocators.CART_SUBTOTAL.get().replaceAll("[^0-9]",""));
    }
}
