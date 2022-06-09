package com.ckon.pageObjects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonPrintAtHomeGiftCardPage extends WebComponent {

    public enum AmazonPrintAtHomeGiftCardPageLocators {
        STANDARD_DESIGN("css=button#gc-customization-type-button-Designs"),
        GIFT_CARD_LIST("css=ul#gc-design-mini-picker"),
        THIRD_CARD("css=ul#gc-design-mini-picker li:nth(2)"),
        CARD_PRICE("css=div#gc-buy-box span.a-color-price"),
        ADD_TO_CART_BUTTON("css=input#gc-buy-box-atc");

        private String myLocator;

        AmazonPrintAtHomeGiftCardPageLocators(String locator) { myLocator = locator; }

        public String get() { return myLocator; }

    }

    public void selectStandardDesign() {
        controller().press(AmazonPrintAtHomeGiftCardPageLocators.STANDARD_DESIGN.get());
    }

    //TODO
    public WebElement getCardDesign(int position) {
        List<WebElement> giftCardList =
                controller().findElements(AmazonPrintAtHomeGiftCardPageLocators.GIFT_CARD_LIST.get());
        return giftCardList.get(position - 1);
    }

    //TODO
    public void selectCardDesign(int position) { getCardDesign(position).click(); }

    public void selectThirdCardDesign() {

        controller().press(AmazonPrintAtHomeGiftCardPageLocators.THIRD_CARD.get());
    }

    public void pressAddToCartButton() {
        controller().press(AmazonPrintAtHomeGiftCardPageLocators.ADD_TO_CART_BUTTON.get());
    }

    public String getCardPrice() {
        String price = controller().getText(AmazonPrintAtHomeGiftCardPageLocators.CARD_PRICE.get());

        return price;
    }
}
