package com.ckon.pageObjects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

public class AmazonShoppingCartPage extends WebComponent {

    public enum AmazonShoppingCartPageLocators {
        CART_SUBTOTAL("css=span.ewc-subtotal-amount span.a-size-base");

        private String myLocator;

        AmazonShoppingCartPageLocators(String locator) { myLocator = locator; }

        public String get() { return myLocator; }

    }

    public String getCartSubtotal() {
        String subtotal = controller().getText(AmazonShoppingCartPageLocators.CART_SUBTOTAL.get());

        return subtotal;
    }
}
