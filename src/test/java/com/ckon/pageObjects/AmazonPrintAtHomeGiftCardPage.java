package com.ckon.pageObjects;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.Objects.nonNull;

public class AmazonPrintAtHomeGiftCardPage extends WebComponent {

    public enum AmazonPrintAtHomeGiftCardPageLocators {
        STANDARD_DESIGN("//button[@id='gc-customization-type-button-Designs']"),
        GIFT_CARD_LIST("//ul[@id='gc-design-mini-picker']"),
        CARD_PRICE("//div[@id='gc-buy-box']/div[1]/div[1]/p[1]/span[contains(@class, a-color-price)]"),
        ADD_TO_CART_BUTTON("//input[@id='gc-buy-box-atc']"),
        THIRD_CARD("/html[1]/body[1]/div[1]/div[2]/div[1]/div[4]/div[4]/form[1]/div[3]/span[1]/ul[1]/li[3]/span[1]/span[1]/span[1]/span[1]/button[1] ");

        private String myLocator;

        AmazonPrintAtHomeGiftCardPageLocators(String locator) { myLocator = locator; }

        public String get() { return myLocator; }

    }

    public void selectStandardDesigns() {
        controller().press(AmazonPrintAtHomeGiftCardPageLocators.STANDARD_DESIGN.get());
    }

    //TODO
    private WebElement findCardDesign(int position) {
        List<WebElement> giftCardList =
                controller().findElements(AmazonPrintAtHomeGiftCardPageLocators.GIFT_CARD_LIST.get());
        return giftCardList.get(position - 1);
    }

    //TODO
    public void selectCardDesign(int position) { findCardDesign(position).click(); }

    public void selectThirdCardDesign() {
        controller().press(AmazonPrintAtHomeGiftCardPageLocators.THIRD_CARD.get());
    }

    public void clickAddToCartButton() {
        controller().press(AmazonPrintAtHomeGiftCardPageLocators.ADD_TO_CART_BUTTON.get());
    }

    public String getCardPrice() {
        String price =
                controller().getText(AmazonPrintAtHomeGiftCardPageLocators.CARD_PRICE.get()
                        .replaceAll("[^0-9]",""));
        System.out.println(price);

        return price;
    }
}
