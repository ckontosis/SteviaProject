package com.ckon.actions;

import com.ckon.pageObjects.AmazonGiftCardPage;
import com.ckon.pageObjects.AmazonMainPage;
import com.ckon.pageObjects.AmazonPrintAtHomeGiftCardPage;
import org.springframework.beans.factory.annotation.Autowired;

public class SelectThirdGiftCard {

    @Autowired
    private AmazonMainPage mainPage;

    @Autowired
    private AmazonGiftCardPage giftCardPage;

    @Autowired
    private AmazonPrintAtHomeGiftCardPage printAtHomePage;


    protected String price;

    public String addGiftCardToBasket() {
        mainPage.pressDontChangeButton();
        mainPage.pressGiftCardButton();
        giftCardPage.pressPrintAtHomeButton();
        printAtHomePage.selectStandardDesign();
//        printAtHomePage.selectCardDesign(3);
        printAtHomePage.selectThirdCardDesign();
        price = printAtHomePage.getCardPrice();
        printAtHomePage.pressAddToCartButton();

        return price;
    }
}
