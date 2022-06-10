package com.ckon.actions;

import com.ckon.pageObjects.AmazonGiftCardPage;
import com.ckon.pageObjects.AmazonMainPage;
import com.ckon.pageObjects.AmazonPrintAtHomeGiftCardPage;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Precondition action for the test
 * Navigates to Main page > Gift card page > Print at Home gift card Page
 * Selects the Standard design then third card design and adds it to basket
 * Saves the card price to assert it equals the subtotal of shopping cart
 * @author Christos Kontosis
 */
public class SelectThirdGiftCard {

    @Autowired
    private AmazonMainPage mainPage;

    @Autowired
    private AmazonGiftCardPage giftCardPage;

    @Autowired
    private AmazonPrintAtHomeGiftCardPage printAtHomePage;

    protected String price;

    /**
     * Completes all precondition actions
     * @return card price as String
     */
    public String addGiftCardToBasket() {
        mainPage.pressDontChangeButton();
        mainPage.pressGiftCardButton();

        giftCardPage.pressPrintAtHomeButton();

        printAtHomePage.selectStandardDesign();
        printAtHomePage.selectThirdCardDesign();
        //get price to
        price = printAtHomePage.getCardPrice();
        printAtHomePage.pressAddToCartButton();

        return price;
    }
}
